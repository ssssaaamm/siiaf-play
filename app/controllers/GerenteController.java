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
        Form<Cliente> cliente_form = Form.form(Cliente.class);
        List<Cliente> clientes_list = Cliente.find.findList();
        return ok(clientes.render(cliente_form,clientes_list));
    }
    //new  
    public Result cliente_new() {
       Form<Cliente>cliente_form = Form.form(Cliente.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Cliente> clientes_list = Cliente.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(clientes.render(cliente_form,clientes_list));
        }

        Cliente nuevo =cliente_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.clientes());
    }
    //edit
    public Result cliente_edit(Long id) {
      Form<Cliente> cliente_form = Form.form(Cliente.class).bindFromRequest();
        List<Cliente> clientes_list = Cliente.find.findList();

        //Si hay errores siempre los retornara
        if(cliente_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(clientes.render(cliente_form,clientes_list));
        }

        Cliente clie = Cliente.find.byId(id);

        if ( clie != null) {
            clie.nombre=cliente_form.get().nombre;
            clie.descripcion=cliente_form.get().descripcion;
            clie.nit=cliente_form.get().nit;
         
            clie.update();  

    }
}
    //remove
    public Result cliente_remove(Long id) {
        Cliente cli = Cliente.find.byId(id);
        if(cli != null){
            cli.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.clientes());
        }
        return redirect(routes.GerenteController.clientes());
    }

    //MOTORISTAS
    //list
    public Result motoristas() {
        Form<Motorista> motorista_form = Form.form(Motorista.class);
        List<Motorista> motoristas_list = Motorista.find.findList();
        return ok(motoristas.render(motorista_form,motoristas_list));
    }
    //new
    public Result motorista_new() {
        Form<Motorista> motorista_form = Form.form(Motorista.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Motorista> motoristas_list = Motorista.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(cmotorista.render(motorista_form,motoristas_list));
        }

        Motorista nuevo =motorista_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.motoristas());
    }
    //edit
    public Result motorista_edit(Long id) {
        Form<Motorista> motorista_form = Form.form(Motorista.class).bindFromRequest();
        List<Motorista> motoristas_list = Motorista.find.findList();

        //Si hay errores siempre los retornara
        if( motorista_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(motmotoristas.render(motorista_form,motoristas_list));
        }

        Motorista mot = Motorista.find.byId(id);

        if (mot != null) {
            mot.codigo=motorista_form.get().codigo;
            mot.nombre=motorista_form.get().nombre;
            mot.licencia=motorista_form.get().licencia;
           

            mot.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.motoristas());
    }
    //remove
    public Result motorista_remove(Long id) {
        Motorista mot = Motorista.find.byId(id);
        if(mot != null){
            mot.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.motoristas());
        }
        return redirect(routes.GerenteController.motoristas());
    }

    //CABEZALES
    //list
    public Result cabezales() {
        Form<Cabezal> cabezal_form = Form.form(Cabezal.class);
        List<Cabezal> cabezales_list = Cabezal.find.findList();
        return ok(cabezales.render(cabezal_form,cabezales_list));
        }

    //new
    public Result cabezal_new() {
        Form<Cabezal> cabezal_form = Form.form(Cabezal.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Cabezal> cabezales_list = Cabezal.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(cabezales.render(cabezal_form,cabezales_list));
        }

        Cabezal nuevo = cabezal_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.cabezales());
        
    }
    //edit
    public Result cabezal_edit(Long id) {
        Form<Cabezal> cabezal_form = Form.form(Cabezal.class).bindFromRequest();
        List<Cabezal> cabezales_list = Cabezal.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(cabezales.render(cabezal_form,cabezales_list));
        }

        Cabezal cab = Cabezal.find.byId(id);

        if (cab != null) {
            cab.placa=cabezal_form.get().placa;
            cab.descripcion=cabezal_form.get().descripcion;
           

            cab.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.cabezales());
    }
    //remove
    public Result cabezal_remove(Long id) {
        Cabezal cab = Cabezal.find.byId(id);
        if(cab != null){
            cab.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.cabezales());
        }
        return redirect(routes.GerenteController.cabezales());
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
