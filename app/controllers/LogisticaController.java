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

        //Si hay errores siempre los retornara
        if( viaje_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(viajes.render(viaje_form,viajes_list));
        }

        Viaje nuevo =viaje_form.get();
        nuevo.save();

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
}
