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
        List<Cliente> clientes_list = Cliente.find.where().eq("activo",true).findList();
        return ok(clientes.render(cliente_form,clientes_list));
    }
    //new  
    public Result cliente_new() {
       Form<Cliente>cliente_form = Form.form(Cliente.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Cliente> clientes_list = Cliente.find.findList();

        //Si hay errores siempre los retornara
        if( cliente_form.hasErrors() ){
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

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.clientes());
    }
    //remove
    public Result cliente_remove(Long id) {
        Cliente cli = Cliente.find.byId(id);
        if(cli != null){
            cli.activo=false;
            cli.update();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.clientes());
        }
        return redirect(routes.GerenteController.clientes());
    }

    //MOTORISTAS
    //list
    public Result motoristas() {
        Form<Motorista> motorista_form = Form.form(Motorista.class);
        List<Motorista> motoristas_list = Motorista.find.where().eq("activo",true).findList();
        return ok(motoristas.render(motorista_form,motoristas_list));
    }
    //new
    public Result motorista_new() {
        Form<Motorista> motorista_form = Form.form(Motorista.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Motorista> motoristas_list = Motorista.find.findList();

        //Si hay errores siempre los retornara
        if( motorista_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(motoristas.render(motorista_form,motoristas_list));
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
            return badRequest(motoristas.render(motorista_form,motoristas_list));
        }

        Motorista mot = Motorista.find.byId(id);

        if (mot != null) {
            mot.codigo=motorista_form.get().codigo;
            mot.nombre=motorista_form.get().nombre;
            mot.dui=motorista_form.get().dui;
            mot.nit=motorista_form.get().nit;
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
            mot.activo=false;
            mot.update();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.motoristas());
        }
        return redirect(routes.GerenteController.motoristas());
    }

    //CABEZALES
    //list
    public Result cabezales() {
        Form<Cabezal> cabezal_form = Form.form(Cabezal.class);
        List<Cabezal> cabezales_list = Cabezal.find.where().eq("activo",true).findList();
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
            cab.activo=false;
            cab.update();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.cabezales());
        }
        return redirect(routes.GerenteController.cabezales());
    }




    public Result planilla() {
        List<DetallePago> detalles = DetallePago.find.where().eq("periodo_planilla",PeriodoPlanilla.find.where().eq("actual",true).findUnique()).findList();
        return ok(planilla.render(detalles));
    }

    public Result facturacion() {
        List<DetalleCobro> detalles = DetalleCobro.find.where().eq("periodo_facturacion",PeriodoFacturacion.find.where().eq("actual",true).findUnique()).findList();
        return ok(facturacion.render(detalles));
    }



    public Result politica_cobro() {
        PoliticaCobro politica = PoliticaCobro.find.where().eq("actual",1).findUnique();
        
        Form<PoliticaCobro> politica_form = null;
        
        if(politica == null){
            politica_form = Form.form(PoliticaCobro.class);
        }else{
            politica_form = politica.getForm();
        }
        
        return ok(politica_cobro.render(politica_form));
    }


    public Result politica_cobro_post(){

        //verificar si existe una politica de cobro con el campo 'actual' en true;
        PoliticaCobro actual = PoliticaCobro.find.where().eq("actual",1).findUnique();
        
        List<PoliticaCobro> politicas = PoliticaCobro.find.findList();
        
        Form<PoliticaCobro> politica_form = Form.form(PoliticaCobro.class).bindFromRequest();

        if( politica_form.hasErrors() ){
            return badRequest(politica_cobro.render(politica_form));
        }

        PoliticaCobro nueva = politica_form.get();


        PoliticaCobro match = PoliticaCobro.find.where().conjunction().eq("duracion_periodo",nueva.duracion_periodo).eq("tarifa_cobro_km_sen",nueva.tarifa_cobro_km_sen).eq("tarifa_cobro_km_car",nueva.tarifa_cobro_km_car).eq("tarifa_cobro_km_vac",nueva.tarifa_cobro_km_vac).eq("tarifa_sobrepeso",nueva.tarifa_sobrepeso).eq("tarifa_cruce_frontera",nueva.tarifa_cruce_frontera).findUnique();



        if(actual!=null){
            if(match!=null){
                if(!actual.equals(match)){
                    actual.actual=false;
                    actual.update();

                    match.actual=true;
                    match.update();
                }
            }else{
                
                actual.actual=false;
                actual.update();

                nueva.actual=true;
                nueva.save();     
            }
        }else{
            nueva.actual=true;
            nueva.save();  
        }

        flash("exito","Operacion exitosa");
        return redirect(routes.GerenteController.politica_cobro());
        


    }


    public Result politica_pago() {
        
        PoliticaPago politica = PoliticaPago.find.where().eq("actual",1).findUnique();
        
        Form<PoliticaPago> politica_form = null;
        
        if(politica == null){
            politica_form = Form.form(PoliticaPago.class);
        }else{
            politica_form = politica.getForm();
        }
        
        return ok(politica_pago.render(politica_form));
    }

    public Result politica_pago_post(){

        //verificar si existe una politica de cobro con el campo 'actual' en true;
        PoliticaPago actual = PoliticaPago.find.where().eq("actual",1).findUnique();
                
        Form<PoliticaPago> politica_form = Form.form(PoliticaPago.class).bindFromRequest();

        if( politica_form.hasErrors() ){
            return badRequest(politica_pago.render(politica_form));
        }


        PoliticaPago nueva = politica_form.get();


        PoliticaPago match = PoliticaPago.find.where().conjunction().eq("duracion_periodo",nueva.duracion_periodo).eq("salario_minimo",nueva.salario_minimo).eq("porcentaje_isss",nueva.porcentaje_isss).eq("porcentaje_afp",nueva.porcentaje_afp).eq("tarifa_pago_km_loc",nueva.tarifa_pago_km_loc).eq("tarifa_pago_km_int",nueva.tarifa_pago_km_int).eq("porcentaje_sobrepeso",nueva.porcentaje_sobrepeso).eq("tarifa_viatico_vv",nueva.tarifa_viatico_vv).eq("tarifa_viatico_vc",nueva.tarifa_viatico_vc).eq("tarifa_viatico_cc",nueva.tarifa_viatico_cc).findUnique();


        if(actual!=null){
            if(match!=null){
                if(!actual.equals(match)){
                    actual.actual=false;
                    actual.update();

                    match.actual=true;
                    match.update();
                }
            }else{
                
                actual.actual=false;
                actual.update();

                nueva.actual=true;
                nueva.save();     
            }
        }else{
            nueva.actual=true;
            nueva.save();  
        }

        flash("exito","Operacion exitosa");
        return redirect(routes.GerenteController.politica_pago());
        
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
