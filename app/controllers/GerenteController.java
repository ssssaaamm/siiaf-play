package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.io.File;

import views.html.gerente.*;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class GerenteController extends Controller {

    //CLIENTES
    //list
    public Result clientes() {
        return ok(clientes.render());
    }
    //new  
    public Result cliente_new() {
        return ok(clientes.render());
    }
    //edit
    public Result cliente_edit(Long id) {
        return ok(clientes.render());
    }
    //remove
    public Result cliente_remove(Long id) {
        return ok(clientes.render());
    }

    //MOTORISTAS
    //list
    public Result motoristas() {
        return ok(motoristas.render());
    }
    //new
    public Result motorista_new() {
        return ok(motoristas.render());
    }
    //edit
    public Result motorista_edit(Long id) {
        return ok(motoristas.render());
    }
    //remove
    public Result motorista_remove(Long id) {
        return ok(motoristas.render());
    }

    //CABEZALES
    //list
    public Result cabezales() {
        return ok(cabezales.render());
    }
    //new
    public Result cabezal_new() {
        return ok(cabezales.render());
    }
    //edit
    public Result cabezal_edit(Long id) {
        return ok(cabezales.render());
    }
    //remove
    public Result cabezal_remove(Long id) {
        return ok(cabezales.render());
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


    //USUARIOS
    //list
    public Result usuarios() {
        Form<Usuario> usuario_form = Form.form(Usuario.class);
        List<Usuario> usuarios_list = Usuario.find.findList();
        return ok(usuarios.render(usuario_form,usuarios_list));
    }
    //add
    public Result usuario_new() {
        Form<Usuario> usuario_form = Form.form(Usuario.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Usuario> usuarios_list = Usuario.find.findList();

        //Si hay errores siempre los retornara
        if( usuario_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(usuarios.render(usuario_form,usuarios_list));
        }

        Usuario nuevo = usuario_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.usuarios());
    }
    //edit
    public Result usuario_edit(Long id) {
        Form<Usuario> usuario_form = Form.form(Usuario.class).bindFromRequest();
        List<Usuario> usuarios_list = Usuario.find.findList();

        //Si hay errores siempre los retornara
        if( usuario_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(usuarios.render(usuario_form,usuarios_list));
        }

        Usuario user = Usuario.find.byId(id);

        if ( user != null) {
            user.nombre=usuario_form.get().nombre;
            user.username=usuario_form.get().username;
            user.password=usuario_form.get().password;
            user.tipo.id=usuario_form.get().tipo.id;

            user.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.usuarios());
    }
    //remove
    public Result usuario_remove(Long id){
        Usuario user = Usuario.find.byId(id);
        if(user != null){
            user.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.usuarios());
        }
        return redirect(routes.GerenteController.usuarios());
    }
}
