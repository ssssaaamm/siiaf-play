package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.File;
import org.joda.time.DateTimeComparator;

import views.html.logistica.*;
import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class LogisticaController extends Controller {

  

     //list
    public Result viajes() {

        List<Viaje> viajes_list = Viaje.find.findList();
        List<Cabezal> cabezales = Cabezal.find.where().eq("activo",true).findList();
        List<Cliente> clientes = Cliente.find.where().eq("activo",true).findList();
        List<Motorista> motoristas = Motorista.find.where().eq("activo",true).findList();

        return ok(viajes.render(viajes_list,cabezales,motoristas,clientes));
        }

    //new get

    

    //new
    public Result viaje_new() {
        
        Map<String, String[]> values = request().body().asFormUrlEncoded();


        //obtenemos el viaje

        Viaje nuevo=null;

        if(
            (values.containsKey("tipo") &&  !values.get("tipo")[0].isEmpty() ) &&
            (values.containsKey("cabezal") &&  !values.get("cabezal")[0].isEmpty() ) &&
            (values.containsKey("motorista") &&  !values.get("motorista")[0].isEmpty() ) &&
            (values.containsKey("cliente") &&  !values.get("cliente")[0].isEmpty() ) 
        ){
            //datos validos para viaje
            nuevo=new Viaje();
            nuevo.tipo=Integer.valueOf(values.get("tipo")[0]);
            nuevo.cabezal=Cabezal.find.byId(Long.valueOf(values.get("cabezal")[0]));
            nuevo.motorista=Motorista.find.byId(Long.valueOf(values.get("motorista")[0]));
            nuevo.cliente=Cliente.find.byId(Long.valueOf(values.get("cliente")[0]));
            if(values.containsKey("viaticos")){
                nuevo.viaticos=true;
                nuevo.tipo_viatico=Integer.valueOf(values.get("tipo_viatico")[0]);
            }
            nuevo.fecha_registro=new Date();


            //obtenemos boletas (recordar que hay 10 maximo)
            for(int i=0;i<=10;i++){
                if(
                    (values.containsKey("codigo["+i+"]") && !values.get("codigo["+i+"]")[0].isEmpty() ) &&
                    (values.containsKey("destino["+i+"]") &&  !values.get("destino["+i+"]")[0].isEmpty() ) &&
                    (values.containsKey("km_asignados["+i+"]") &&  !values.get("km_asignados["+i+"]")[0].isEmpty() ) &&
                    (values.containsKey("tipo_carga["+i+"]") &&  !values.get("tipo_carga["+i+"]")[0].isEmpty() ) &&
                    (values.containsKey("sentido["+i+"]") &&  !values.get("sentido["+i+"]")[0].isEmpty() )
                ){
                    //datos validos para la boleta i
                    Boleta bol=new Boleta();
                    bol.codigo = values.get("codigo["+i+"]")[0];
                    bol.destino = values.get("destino["+i+"]")[0];
                    bol.km_asignados = Double.valueOf(values.get("km_asignados["+i+"]")[0]);
                    bol.tipo_carga = Integer.valueOf(values.get("tipo_carga["+i+"]")[0]);
                    bol.sentido = Integer.valueOf(values.get("sentido["+i+"]")[0]);
                    if(values.containsKey("sobrepeso["+i+"]")){
                        bol.sobrepeso=true;
                    }
                    if(values.containsKey("cruce_frontera["+i+"]")){
                        bol.cruce_frontera=true;
                    }


                    bol.viaje=nuevo;
                    nuevo.boletas.add(bol);
                    nuevo.total_km=nuevo.total_km+bol.km_asignados;
                }
            }


            //guardamos el viaje y sus boletas 
            if(nuevo.boletas.size()>0){

                //antes de guardar nos aseguramos que todo este en orden con respecto a los periodos de facturacion
                PeriodoFacturacion pf1=PeriodoFacturacion.find.where().eq("actual",true).findUnique();


                if(pf1 != null){
                    if(DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pf1.fecha_inicio) < 0){
                        //(nos encontramos en periodos anteriores) verificar la hora del sistema (servidor), la hora esta retrasada
                        flash("error","No se pueden registrar los viajes. La hora del sistema es incorrecta");
                        return redirect(routes.LogisticaController.viajes());
                    }else{
                        if( DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pf1.fecha_fin) > 0){
                            //nos encontramos ante un nuevo periodo de facturacion debemos iniciarlo con la politica actual
                            PoliticaCobro pc_actual=PoliticaCobro.find.where().eq("actual",true).findUnique();
                            
                            if(pc_actual==null){
                                //no ha configurado politica de facturacion
                                flash("error","No se pueden registrar los viajes. No ha configurado la politica de cobros para facturacion");
                                return redirect(routes.LogisticaController.viajes());
                            }

                            //el siguiete ciclo soluciona el problema de periodos sin viajes registrados
                            boolean periodo_preparado=false;
                            while(!periodo_preparado){
                                PeriodoFacturacion pf2 = new PeriodoFacturacion();
                                
                                Calendar inicio = Calendar.getInstance();
                                inicio.setTime(pf1.fecha_fin);
                                inicio.set(Calendar.HOUR_OF_DAY,0);
                                inicio.set(Calendar.MINUTE,0);
                                inicio.set(Calendar.SECOND,0);
                                inicio.add(Calendar.DAY_OF_YEAR,1);
                                pf2.fecha_inicio = inicio.getTime();
                                
                                Calendar fin = Calendar.getInstance();
                                fin.setTime(pf2.fecha_inicio);
                                fin.add(Calendar.DAY_OF_YEAR,pc_actual.duracion_periodo-1);
                                fin.set(Calendar.HOUR_OF_DAY,23);
                                fin.set(Calendar.MINUTE,59);
                                fin.set(Calendar.SECOND,59);
                                pf2.fecha_fin = fin.getTime();
                                
                                pf2.politica_cobro=pc_actual;
                                pf2.actual=true;
                                
                                pf1.actual=false;

                                pf2.save();
                                pf1.update();

                                pf1=pf2;

                                if(DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pf2.fecha_inicio) >= 0 && DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pf2.fecha_fin) <= 0){     
                                    nuevo.periodo_facturacion=pf2;
                                    periodo_preparado=true;        
                                }
                            }//fin while
                        }else{
                            //nos encontramos en el periodo actual :) todo es nice todo es chivo aqui
                            nuevo.periodo_facturacion=pf1;
                        }//fin else
                    }//fin else
                }else{
                    //creacion del primer periodo de facturacion :3
                    PoliticaCobro pc_actual=PoliticaCobro.find.where().eq("actual",true).findUnique();
                    if(pc_actual==null){
                        //no ha configurado politica de facturacion
                        flash("error","No se pueden registrar los viajes. No ha configurado la politica de cobros para facturacion");
                        return redirect(routes.LogisticaController.viajes());
                    }

                    PeriodoFacturacion pf3 = new PeriodoFacturacion();
                    //la fecha de inicio de este periodo sera la fecha del primer viaje registrado
                    Calendar inicio = Calendar.getInstance();
                    inicio.setTime(nuevo.fecha_registro);
                    inicio.set(Calendar.HOUR_OF_DAY,0);
                    inicio.set(Calendar.MINUTE,0);
                    inicio.set(Calendar.SECOND,0);
                    pf3.fecha_inicio = inicio.getTime();

                    Calendar fin = Calendar.getInstance();
                    fin.setTime(pf3.fecha_inicio);
                    fin.add(Calendar.DAY_OF_YEAR,pc_actual.duracion_periodo-1);
                    fin.set(Calendar.HOUR_OF_DAY,23);
                    fin.set(Calendar.MINUTE,59);
                    fin.set(Calendar.SECOND,59);
                    pf3.fecha_fin = fin.getTime();
                    
                    pf3.politica_cobro=pc_actual;
                    pf3.actual=true;
                    
                    pf3.save();
                    nuevo.periodo_facturacion=pf3;
                }

                //antes de guardar nos aseguramos que todo este en orden con respecto a los periodos de planilla
                PeriodoPlanilla pp1=PeriodoPlanilla.find.where().eq("actual",true).findUnique();

                if(pp1 != null){
                    if(DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pp1.fecha_inicio) < 0){
                        //(nos encontramos en periodos anteriores) verificar la hora del sistema (servidor), la hora esta retrasada
                        flash("error","No se pueden registrar los viajes. La hora del sistema es incorrecta");
                        return redirect(routes.LogisticaController.viajes());
                    }else{
                        if(DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pp1.fecha_fin) > 0){
                            //nos encontramos ante un nuevo periodo de planilla debemos iniciarlo con la politica actual
                            PoliticaPago pp_actual=PoliticaPago.find.where().eq("actual",true).findUnique();
                            
                            if(pp_actual==null){
                                //no ha configurado politica de planilla
                                flash("error","No se pueden registrar los viajes. No ha configurado la politica de pago para planilla");
                                return redirect(routes.LogisticaController.viajes());
                            }

                            //el siguiete ciclo soluciona el problema de periodos sin viajes registrados
                            boolean periodo_preparado=false;
                            while(!periodo_preparado){
                                PeriodoPlanilla pp2 = new PeriodoPlanilla();

                                Calendar inicio = Calendar.getInstance();
                                inicio.setTime(pp1.fecha_fin);
                                inicio.set(Calendar.HOUR_OF_DAY,0);
                                inicio.set(Calendar.MINUTE,0);
                                inicio.set(Calendar.SECOND,0);
                                inicio.add(Calendar.DAY_OF_YEAR,1);
                                pp2.fecha_inicio = inicio.getTime();
                                
                                Calendar fin = Calendar.getInstance();
                                fin.setTime(pp2.fecha_inicio);
                                fin.add(Calendar.DAY_OF_YEAR,pp_actual.duracion_periodo-1);
                                fin.set(Calendar.HOUR_OF_DAY,23);
                                fin.set(Calendar.MINUTE,59);
                                fin.set(Calendar.SECOND,59);
                                pp2.fecha_fin = fin.getTime();
                                
                                pp2.politica_pago=pp_actual;
                                pp2.actual=true;
                                
                                pp1.actual=false;

                                pp2.save();
                                pp1.update();

                                pp1=pp2;

                                if(DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pp2.fecha_inicio) >= 0 && DateTimeComparator.getDateOnlyInstance().compare(nuevo.fecha_registro,pp2.fecha_fin) <= 0){     
                                    nuevo.periodo_planilla=pp2;
                                    periodo_preparado=true;        
                                }
                            }//fin while
                        }else{
                            //nos encontramos en el periodo actual :) todo es nice todo es chivo aqui
                            nuevo.periodo_planilla=pp1;
                        }//fin else
                    }//fin else
                }else{
                    //creacion del primer periodo de planilla :3
                    PoliticaPago pp_actual=PoliticaPago.find.where().eq("actual",true).findUnique();
                    if(pp_actual==null){
                        //no ha configurado politica de planilla
                        flash("error","No se pueden registrar los viajes. No ha configurado la politica de pago para planilla");
                        return redirect(routes.LogisticaController.viajes());
                    }

                    PeriodoPlanilla pp3 = new PeriodoPlanilla();
                    //la fecha de inicio de este periodo sera la fecha del primer viaje registrado
                    Calendar inicio = Calendar.getInstance();
                    inicio.setTime(nuevo.fecha_registro);
                    inicio.set(Calendar.HOUR_OF_DAY,0);
                    inicio.set(Calendar.MINUTE,0);
                    inicio.set(Calendar.SECOND,0);
                    pp3.fecha_inicio = inicio.getTime();


                    Calendar fin = Calendar.getInstance();
                    fin.setTime(pp3.fecha_inicio);
                    fin.add(Calendar.DAY_OF_YEAR,pp_actual.duracion_periodo-1);
                    fin.set(Calendar.HOUR_OF_DAY,23);
                    fin.set(Calendar.MINUTE,59);
                    fin.set(Calendar.SECOND,59);

                    pp3.fecha_fin = fin.getTime();
                   
                    pp3.politica_pago=pp_actual;
                    pp3.actual=true;
                    
                    pp3.save();
                    nuevo.periodo_planilla=pp3;
                }

                //al fin guardamos el viaje :)
                nuevo.save();
                flash("exito","Operacion exitosa!");

            }else{
                //datos invalidos para boletas debe mostrarse error en formulario
                flash("error","Error en datos de boletas!");
                flash("modal","mod-new");
            }

        }else{
            //datos invalidos para viaje debe mostrarse error en formulario
            flash("error","Error en datos generales del viaje!");
            flash("modal","mod-new");
        }

        return redirect(routes.LogisticaController.viajes());
        
    }//fin viaje_new()




    //edit get
    public Result viaje_edit(Long id){
        
        Viaje viaje=Viaje.find.byId(id);
        List<Cabezal> cabezales = Cabezal.find.where().eq("activo",true).findList();
        List<Cliente> clientes = Cliente.find.where().eq("activo",true).findList();
        List<Motorista> motoristas = Motorista.find.where().eq("activo",true).findList();
        
        if(viaje==null){
            return redirect(routes.LogisticaController.viajes());
        }

        return ok(viaje_edit.render(viaje,cabezales,motoristas,clientes));

    }



    //edit
    public Result viaje_edit_post(Long id) {

        Map<String, String[]> values = request().body().asFormUrlEncoded();

        //obtenemos el viaje

        Viaje temp=null;

        if(
            (values.containsKey("tipo") &&  !values.get("tipo")[0].isEmpty() ) &&
            (values.containsKey("cabezal") &&  !values.get("cabezal")[0].isEmpty() ) &&
            (values.containsKey("motorista") &&  !values.get("motorista")[0].isEmpty() ) &&
            (values.containsKey("cliente") &&  !values.get("cliente")[0].isEmpty() ) 
        ){
            //datos validos para viaje (crearemos uno temporal)
            temp=Viaje.find.byId(id);
            if(temp!=null){
                temp.boletas.clear();
                temp.total_km=0.0;
                temp.tipo=Integer.valueOf(values.get("tipo")[0]);
                temp.cabezal=Cabezal.find.byId(Long.valueOf(values.get("cabezal")[0]));
                temp.motorista=Motorista.find.byId(Long.valueOf(values.get("motorista")[0]));
                temp.cliente=Cliente.find.byId(Long.valueOf(values.get("cliente")[0]));
                if(values.containsKey("viaticos")){
                    temp.viaticos=true;
                    temp.tipo_viatico=Integer.valueOf(values.get("tipo_viatico")[0]);
                }


                //obtenemos boletas (recordar que hay 10 maximo)
                for(int i=0;i<=10;i++){
                    if(
                        (values.containsKey("codigo["+i+"]") && !values.get("codigo["+i+"]")[0].isEmpty() ) &&
                        (values.containsKey("destino["+i+"]") &&  !values.get("destino["+i+"]")[0].isEmpty() ) &&
                        (values.containsKey("km_asignados["+i+"]") &&  !values.get("km_asignados["+i+"]")[0].isEmpty() ) &&
                        (values.containsKey("tipo_carga["+i+"]") &&  !values.get("tipo_carga["+i+"]")[0].isEmpty() ) &&
                        (values.containsKey("sentido["+i+"]") &&  !values.get("sentido["+i+"]")[0].isEmpty() )
                    ){
                        //datos validos para la boleta i
                        Boleta bol=new Boleta();
                        bol.codigo = values.get("codigo["+i+"]")[0];
                        bol.destino = values.get("destino["+i+"]")[0];
                        bol.km_asignados = Double.valueOf(values.get("km_asignados["+i+"]")[0]);
                        bol.tipo_carga = Integer.valueOf(values.get("tipo_carga["+i+"]")[0]);
                        bol.sentido = Integer.valueOf(values.get("sentido["+i+"]")[0]);
                        if(values.containsKey("sobrepeso["+i+"]") && !values.get("sobrepeso["+i+"]")[0].isEmpty()){
                            bol.sobrepeso=true;
                        }
                        if(values.containsKey("cruce_frontera["+i+"]")  && !values.get("cruce_frontera["+i+"]")[0].isEmpty()){
                            bol.cruce_frontera=true;
                        }
                        if(values.containsKey("id["+i+"]") && !values.get("id["+i+"]")[0].isEmpty()){
                            Boleta.find.byId(Long.valueOf(values.get("id["+i+"]")[0])).delete();
                        }


                        bol.viaje=temp;
                        temp.boletas.add(bol);
                        temp.total_km=temp.total_km+bol.km_asignados;
                    }
                }


                //si hay almenos una boleta valida podemos guardar el viaje
                if(temp.boletas.size()>0){
                    
                    temp.update();
                    flash("exito","Operacion exitosa!");

                }else{
                    //datos invalidos para boletas debe mostrarse error en formulario
                    flash("error","Error en datos de boletas!");
                }


            }

        }else{
            //datos invalidos para viaje debe mostrarse error en formulario
            flash("error","Error en datos generales del viaje!");
        }

        return redirect(routes.LogisticaController.viaje_edit(id));
    }//fin viaje_edit_post()


    //remove
    public Result viaje_remove(Long id) {
        Viaje via = Viaje.find.byId(id);
        if(via != null){
            via.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.LogisticaController.viajes());
        }
        return redirect(routes.LogisticaController.viajes());
    }

    public Result planilla() {
        return ok(planilla.render());
    }

    public Result facturacion() {
        return ok(facturacion.render());
    }

    public Result politica_cobro() {
        return ok(politica_cobro.render());
    }

    public Result politica_pago() {
        return ok(politica_pago.render());
    }

}
