package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.File;

import views.html.logistica.*;
import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class LogisticaController extends Controller {

  

     //list
    public Result viajes() {
        Form<Viaje>viaje_form = Form.form(Viaje.class);
        List<Viaje> viajes_list = Viaje.find.findList();
        return ok(viajes.render(viaje_form,viajes_list));
        }

    //new get

    

    //new
    public Result viaje_new() {
        
        //Form<Viaje>viaje_form = Form.form(Viaje.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        //List<Viaje> viajes_list = Viaje.find.findList();

        // //Si hay errores siempre los retornara
        // if( viaje_form.hasErrors() ){
        //     flash("modal","mod-new");
        //     return badRequest(viajes.render(viaje_form,viajes_list));
        // }

        // 
        // Viaje nuevo =viaje_form.get();
        // nuevo.fecha_registro=new Date();


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
                }
            }

            if(nuevo.boletas.size()>0){
                nuevo.save();
                for(Boleta b : nuevo.boletas){
                    b.save();
                }
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
        
    }


    //edit get
    public Result viaje_edit(Long id){
        return ok(viaje_edit.render(Viaje.find.byId(id)));
    }

    //edit
    public Result viaje_edit_post(Long id) {
        // Form<Viaje>viaje_form = Form.form(Viaje.class).bindFromRequest();
        // List<Viaje> viajes_list = Viaje.find.findList();

        // //Si hay errores siempre los retornara
        // if(viaje_form.hasErrors()){
        //     flash("modal","mod-edit-"+id.toString());
        //     return badRequest(viajes.render(viaje_form,viajes_list));
        // }

        // Viaje via = Viaje.find.byId(id);

        // if (via != null) {
        //     via.tipo=viaje_form.get().tipo;
        //     via.fecha_registro=viaje_form.get().fecha_registro;
        //     via.total_km=viaje_form.get().total_km;
        //     via.viaticos=viaje_form.get().viaticos;
        //     via.tipo_viatico=viaje_form.get().tipo_viatico;


            

        //     via.update();
        // }        

        // flash("exito","Operacion exitosa!");

        // return redirect(routes.LogisticaController.viajes());



        Map<String, String[]> values = request().body().asFormUrlEncoded();

        //obtenemos el viaje

        Viaje temp=null;

        if(
            (values.containsKey("tipo") &&  !values.get("tipo")[0].isEmpty() ) &&
            (values.containsKey("cabezal") &&  !values.get("cabezal")[0].isEmpty() ) &&
            (values.containsKey("motorista") &&  !values.get("motorista")[0].isEmpty() ) &&
            (values.containsKey("cliente") &&  !values.get("cliente")[0].isEmpty() ) 
        ){
            //datos validos para viaje
            temp=new Viaje();
            temp.tipo=Integer.valueOf(values.get("tipo")[0]);
            temp.cabezal=Cabezal.find.byId(Long.valueOf(values.get("cabezal")[0]));
            temp.motorista=Motorista.find.byId(Long.valueOf(values.get("motorista")[0]));
            temp.cliente=Cliente.find.byId(Long.valueOf(values.get("cliente")[0]));
            if(values.containsKey("viaticos")){
                temp.viaticos=true;
                temp.tipo_viatico=Integer.valueOf(values.get("tipo_viatico")[0]);
            }
            temp.fecha_registro=new Date();


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
                }
            }

            if(temp.boletas.size()>0){
                Viaje modificando=Viaje.find.byId(id);
                //le cambiamos todos los datos
                modificando.tipo=temp.tipo;
                modificando.cabezal=temp.cabezal;
                modificando.motorista=temp.motorista;
                modificando.cliente=temp.cliente;
                modificando.viaticos=temp.viaticos;
                modificando.tipo_viatico=temp.tipo_viatico;


                //eliminamos las boletas anteriores
                for(Boleta b : modificando.boletas){
                    b.delete();
                }
                //le ponemos las nuevas
                for(Boleta b : temp.boletas){
                    b.viaje=modificando;
                    modificando.boletas.add(b);
                    b.save();
                }

                modificando.update();

                flash("exito","Operacion exitosa!");
            }else{
                //datos invalidos para boletas debe mostrarse error en formulario
                flash("error","Error en datos de boletas!");
            }

        }else{
            //datos invalidos para viaje debe mostrarse error en formulario
            flash("error","Error en datos generales del viaje!");
        }

        return redirect(routes.LogisticaController.viaje_edit(id));


    }
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

    private boolean validarBoleta(String codigo, String destino, String km_asingados, String tipo_carga, String sentido){
        boolean returning = false;

        if(
            codigo != null ||
            destino != null ||
            km_asingados != null ||
            tipo_carga != null ||
            sentido != null 
            // sobrepeso != null ||
            // cruce_frontera != null
        ){
            if(
                codigo != null &&
                destino != null &&
                km_asingados != null &&
                tipo_carga != null &&
                sentido != null 
                // sobrepeso != null &&
                // cruce_frontera != null
            ){
                returning = true;
            }else{
                //boleta no completada
                returning = false;
            }
        }else{
            //boleta completamente vacia;
            returning = false;
        }

        return returning;
    }

    private boolean getValueCheckbox(String val){
        boolean returning=false;
        if(val==null){
            returning=false;
        }else{
            returning=true;
        }
        return returning;
    }

    // private boolean validarDatos(Map<String, String[]> values){
    //     boolean returning =null;

    //     //datos generales del viaje
    //     String tipo = values.get("tipo")[0];
    //     String cabezal = values.get.("cabezal")[0];
    //     String motorista = values.get("motorista")[0];
    //     String viaticos = values.get("viaticos")[0];
    //     String tipo_viatico = values.get("tipo_viatico");


    // }

}
