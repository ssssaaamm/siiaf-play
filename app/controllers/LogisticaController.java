package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
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

    //new
    public Result viaje_new() {
        Form<Viaje>viaje_form = Form.form(Viaje.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Viaje> viajes_list = Viaje.find.findList();

        // //Si hay errores siempre los retornara
        // if( viaje_form.hasErrors() ){
        //     flash("modal","mod-new");
        //     return badRequest(viajes.render(viaje_form,viajes_list));
        // }

        // //obtenemos el viaje
        // Viaje nuevo =viaje_form.get();
        // nuevo.fecha_registro=new Date();

        Viaje nuevo=new Viaje();

        nuevo.tipo=Integer.valueOf(values.get("tipo")[0]);
        nuevo.cabezal=Cabezal.find.byId(Long.valueOf(values.get("cabezal")[0]));
        nuevo.motorista=Motorista.find.byId(Long.valueOf(values.get("motorista")[0]));
        if(values.containsKey("viaticos")){
            nuevo.viaticos=true;
            nuevo.tipo_viatico=Integer.valueOf(values.get("tipo_viatico")[0]);
        }
        nuevo.fecha_registro=new Date();
        nuevo.save();

        //obtenemos las boletas
        for(int i=1; i<=1; i++){
            String codigo = values.get("codigo"+i)[0];
            String destino = values.get("destino"+i)[0];
            String km_asignados = values.get("km_asignados"+i)[0];
            String tipo_carga = values.get("tipo_carga"+i)[0];
            String sentido = values.get("sentido"+i)[0];
            // String sobrepeso = values.get("sobrepeso"+i)[0];
            // String cruce_frontera = values.get("cruce_frontera"+i)[0];

            if(
                values.containsKey("codigo"+i) &&
                values.containsKey("destino"+i) &&
                values.containsKey("km_asignados"+i) &&
                values.containsKey("tipo_carga"+i) &&
                values.containsKey("sentido"+i)
            ){

            }

            boolean valida = validarBoleta(codigo,destino,km_asignados,tipo_carga,sentido);

            if(valida){
                Boleta bol=new Boleta();
                bol.codigo = codigo;
                bol.destino = destino;
                bol.km_asignados = Double.valueOf(km_asignados);
                bol.tipo_carga = Integer.valueOf(tipo_carga);
                bol.sentido = Integer.valueOf(sentido);
                if(values.containsKey("sobrepeso"+i)){
                    bol.sobrepeso=true;
                }
                if(values.containsKey("cruce_frontera"+i)){
                    bol.cruce_frontera=true;
                }

                bol.viaje=nuevo;
                nuevo.boletas.add(bol);
                bol.save();
            }
        }



        

        flash("exito","Operacion exitosa!");

        return redirect(routes.LogisticaController.viajes());
        
    }
    //edit
    public Result viaje_edit(Long id) {
        Form<Viaje>viaje_form = Form.form(Viaje.class).bindFromRequest();
        List<Viaje> viajes_list = Viaje.find.findList();

        //Si hay errores siempre los retornara
        if(viaje_form.hasErrors()){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(viajes.render(viaje_form,viajes_list));
        }

        Viaje via = Viaje.find.byId(id);

        if (via != null) {
            via.tipo=viaje_form.get().tipo;
            via.fecha_registro=viaje_form.get().fecha_registro;
            via.total_km=viaje_form.get().total_km;
            via.viaticos=viaje_form.get().viaticos;
            via.tipo_viatico=viaje_form.get().tipo_viatico;


            

            via.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.LogisticaController.viajes());
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
