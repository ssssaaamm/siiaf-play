package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.io.File;
import java.text.SimpleDateFormat;

import views.html.gerente.*;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class GerenteController extends Controller {

    public Result home(){

        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/

        return redirect(routes.GerenteController.clientes());
    }

    //CLIENTES
    //list
    public Result clientes() {


        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/


        Form<Cliente> cliente_form = Form.form(Cliente.class);
        List<Cliente> clientes_list = Cliente.find.where().eq("activo",true).findList();
        return ok(clientes.render(cliente_form,clientes_list));
    }


    //new  
    public Result cliente_new() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



       Form<Cliente>cliente_form = Form.form(Cliente.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Cliente> clientes_list = Cliente.find.findList();

        //Si hay errores siempre los retornara
        if( cliente_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(clientes.render(cliente_form,clientes_list));
        }
        if( Cliente.find.where().eq("nit",values.get("nit")[0]).findUnique()!=null){
            flash("error","Este cliente yaesta registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.clientes());
        }

        Cliente nuevo =cliente_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.clientes());
    }

    //edit
    public Result cliente_edit(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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
            if(!clie.nit.equals(cliente_form.get().nit)){
                    if( Cliente.find.where().eq("nit",clie.nit).findUnique()!=null){
                        flash("error","Este cliente ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.clientes());
                    }
            }
           
         
            clie.update();  

        }

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.clientes());
    }


    //remove
    public Result cliente_remove(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Motorista> motorista_form = Form.form(Motorista.class);
        List<Motorista> motoristas_list = Motorista.find.where().eq("activo",true).findList();
        return ok(motoristas.render(motorista_form,motoristas_list));
    }
    //new
    public Result motorista_new() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Motorista> motorista_form = Form.form(Motorista.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Motorista> motoristas_list = Motorista.find.findList();

        //Si hay errores siempre los retornara
        if( motorista_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(motoristas.render(motorista_form,motoristas_list));
        }
         if( Motorista.find.where().eq("codigo",values.get("codigo")[0]).findUnique()!=null){
            flash("error","Este motorista ya fue registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.motoristas());
        }
        if( Motorista.find.where().eq("dui",values.get("dui")[0]).findUnique()!=null){
            flash("error","Este motorista ya fue registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.motoristas());
        }
        if( Motorista.find.where().eq("nit",values.get("nit")[0]).findUnique()!=null){
            flash("error","Este motorista ya fue registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.motoristas());
        }
        if( Motorista.find.where().eq("licencia",values.get("licencia")[0]).findUnique()!=null){
            flash("error","Este motorista ya fue registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.motoristas());
        }

        Motorista nuevo =motorista_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.motoristas());
    }


    //edit
    public Result motorista_edit(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Motorista> motorista_form = Form.form(Motorista.class).bindFromRequest();
        List<Motorista> motoristas_list = Motorista.find.findList();

        //Si hay errores siempre los retornara
        if( motorista_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(motoristas.render(motorista_form,motoristas_list));
        }

        Motorista mot = Motorista.find.byId(id);

        if (mot != null) {
             if(!mot.codigo.equals(motorista_form.get().codigo)){
                    if( Motorista.find.where().eq("codigo",mot.codigo).findUnique()!=null){
                        flash("error","Este motorista ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.motoristas());
                    }
            }
            //mot.codigo=motorista_form.get().codigo;
            mot.nombre=motorista_form.get().nombre;
             if(!mot.dui.equals(motorista_form.get().dui)){
                    if( Motorista.find.where().eq("dui",mot.dui).findUnique()!=null){
                        flash("error","Este motorista ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.motoristas());
                    }
            }
            //mot.dui=motorista_form.get().dui;
             if(!mot.nit.equals(motorista_form.get().nit)){
                    if( Motorista.find.where().eq("nit",mot.nit).findUnique()!=null){
                        flash("error","Este motorista ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.motoristas());
                    }
            }
            //mot.nit=motorista_form.get().nit;
             if(!mot.licencia.equals(motorista_form.get().licencia)){
                    if( Motorista.find.where().eq("licencia",mot.licencia).findUnique()!=null){
                        flash("error","Este motorista ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.motoristas());
                    }
            }
            //mot.licencia=motorista_form.get().licencia;
           

            mot.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.motoristas());
    }
    //remove
    public Result motorista_remove(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/


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



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Cabezal> cabezal_form = Form.form(Cabezal.class);
        List<Cabezal> cabezales_list = Cabezal.find.where().eq("activo",true).findList();
        return ok(cabezales.render(cabezal_form,cabezales_list));
        }

    //new
    public Result cabezal_new() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Cabezal> cabezal_form = Form.form(Cabezal.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Cabezal> cabezales_list = Cabezal.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(cabezales.render(cabezal_form,cabezales_list));
        }
        if( Cabezal.find.where().eq("placa",values.get("placa")[0]).findUnique()!=null){
            flash("error","El Cabezal ya fue registrado");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.cabezales());
        }

        Cabezal nuevo = cabezal_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.cabezales());
        
    }
    //edit
    public Result cabezal_edit(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Cabezal> cabezal_form = Form.form(Cabezal.class).bindFromRequest();
        List<Cabezal> cabezales_list = Cabezal.find.findList();

        //Si hay errores siempre los retornara
        if( cabezal_form.hasErrors() ){
            flash("modal","mod-edit-"+id.toString());
            return badRequest(cabezales.render(cabezal_form,cabezales_list));
        }

        Cabezal cab = Cabezal.find.byId(id);

        if (cab != null) {
               if(!cab.placa.equals(cabezal_form.get().placa)){
                    if( Cabezal.find.where().eq("placa",cab.placa).findUnique()!=null){
                        flash("error","Este cabezal ya fue registrado");
                        flash("modal","mod-edit-"+id.toString());
                        return redirect(routes.GerenteController.cabezales());
                    }
                }
            
            cab.descripcion=cabezal_form.get().descripcion;
           

            cab.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.cabezales());
    }
    //remove
    public Result cabezal_remove(Long id) {




        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Cabezal cab = Cabezal.find.byId(id);
        if(cab != null){
            cab.activo=false;
            cab.update();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.cabezales());
        }
        return redirect(routes.GerenteController.cabezales());
    }




    public Result planilla(){//cuando el usuario no indique periodo se mostrara siempre el periodo actual





        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/




        PeriodoPlanilla periodo_a_mostrar = PeriodoPlanilla.find.where().eq("actual",true).findUnique();
        
        if(periodo_a_mostrar==null){
            flash("error","Actualmente NO hay periodo de planilla, esto puede ser porque aun no se ha registrado ningun viaje en el sistema");
            return badRequest(errores.render());
        }

        return redirect(routes.GerenteController.planilla_show(periodo_a_mostrar.id));
    }

    public Result planilla_show(Long id) {//recibe el id del periodo de planilla que quiere observar




        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/




        PeriodoPlanilla periodo = PeriodoPlanilla.find.byId(id);

        if(periodo==null){
           flash("error","El periodo de planilla buscado no se encuentra, esto puede ser porque aun no se ha registrado ningun viaje en el sistema o el periodo no ha ocurrido (no existe en la base de datos)");
            return badRequest(errores.render());
           //return redirect(routes.LogisticaController.errores());
        }

        List<DetallePago> detalles = DetallePago.find.where().eq("periodo_planilla",periodo).findList();
        
        List<PeriodoPlanilla> periodos= PeriodoPlanilla.find.findList();
        return ok(planilla.render(detalles,periodos));
    }



    public Result planilla_post() {




        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Map<String, String[]> values = request().body().asFormUrlEncoded();

        if(!values.get("fecha_inicio")[0].isEmpty()){
            //return ok("entro aqui");

            try{
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                Date fecha_inicio = sdf.parse(values.get("fecha_inicio")[0]);
                PeriodoPlanilla periodo = PeriodoPlanilla.find.where().eq("fecha_inicio",fecha_inicio).findUnique();

                if(periodo == null){
                    flash("error","La fecha que ha ingresado no coincide con la fecha de inicio de ningun periodo de planilla, por favor intente nuevamente utilizando el selector de fechas");
                    return badRequest(errores.render());
                }

                Long id_periodo = periodo.id;
                return redirect(routes.GerenteController.planilla_show(id_periodo));
        
            }catch(Exception e){
                flash("error","La fecha que ha ingresado no tiene el formato adecuado, por favor utilice el selector de fechas, en lugar de ingresar fechas manualmente");
                return badRequest(errores.render());
                
                
            }
            
        }
        //usuario redirigido a planilla actual porque no ingreso nada en el input date
        return redirect(routes.GerenteController.planilla());       
    }


    

    public Result facturacion(){//cuando el usuario no indique periodo se mostrara siempre el periodo actual



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        PeriodoFacturacion periodo_a_mostrar = PeriodoFacturacion.find.where().eq("actual",true).findUnique();
        
        if(periodo_a_mostrar==null){
            flash("error","Actualmente NO hay periodo de facturacion, esto puede ser porque aun no se ha registrado ningun viaje en el sistema");
            return badRequest(errores.render());
        }

        return redirect(routes.GerenteController.facturacion_show(periodo_a_mostrar.id));
    }

    public Result facturacion_show(Long id) {//recibe el id del periodo de planilla que quiere observar

        //metodo post para ver una planilla con id especifico

        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        PeriodoFacturacion periodo = PeriodoFacturacion.find.byId(id);

        if(periodo==null){
           flash("error","El periodo de facturacion buscado no se encuentra, esto puede ser porque aun no se ha registrado ningun viaje en el sistema o el periodo no ha ocurrido (no existe en la base de datos)");
            return badRequest(errores.render());
           //return redirect(routes.LogisticaController.errores());
        }

        List<DetalleCobro> detalles = DetalleCobro.find.where().eq("periodo_facturacion",periodo).findList();
        
        List<PeriodoFacturacion> periodos= PeriodoFacturacion.find.findList();
        return ok(facturacion.render(detalles,periodos));
    }



    public Result facturacion_post() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Map<String, String[]> values = request().body().asFormUrlEncoded();

        if(!values.get("fecha_inicio")[0].isEmpty()){
            //return ok("entro aqui");

            try{
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                Date fecha_inicio = sdf.parse(values.get("fecha_inicio")[0]);
                PeriodoFacturacion periodo = PeriodoFacturacion.find.where().eq("fecha_inicio",fecha_inicio).findUnique();

                if(periodo == null){
                    flash("error","La fecha que ha ingresado no coincide con la fecha de inicio de ningun periodo de facturacion, por favor intente nuevamente utilizando el selector de fechas");
                    return badRequest(errores.render());
                }

                Long id_periodo = periodo.id;
                return redirect(routes.GerenteController.facturacion_show(id_periodo));
        
            }catch(Exception e){
                flash("error","La fecha que ha ingresado no tiene el formato adecuado, por favor utilice el selector de fechas, en lugar de ingresar fechas manualmente");
                return badRequest(errores.render());
                
                
            }
            
        }
        //usuario redirigido a planilla actual porque no ingreso nada en el input date
        return redirect(routes.GerenteController.facturacion());       
    }



    public Result asignar_bono(Long id){

        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/


        DetallePago dp = DetallePago.find.byId(id);
        if(dp==null){
            flash("error","El bono no se puede asignar debido a que el detalle de cobro no existe");
            return badRequest(errores.render());
        }

        if(dp.periodo_planilla.actual==false){
            flash("global_error","No puede cambiar los bonos de trabajadores en periodos ya caducados");
            return redirect(routes.GerenteController.planilla_show(dp.periodo_planilla.id));
        }

        Map<String, String[]> values = request().body().asFormUrlEncoded();
        String valor=values.get("bono["+dp.id+"]")[0];
        
        if(valor==null){
            flash("modal","mod-bono-"+dp.id);
            flash("error","Debe ingresar un valor para el bono");
            return redirect(routes.GerenteController.planilla_show(dp.periodo_planilla.id));
        }

        if(valor.isEmpty()){
            flash("modal","mod-bono-"+dp.id);
            flash("error","Debe ingresar un valor para el bono");
            return redirect(routes.GerenteController.planilla_show(dp.periodo_planilla.id));
        }

        dp.bono=Double.valueOf(valor);
        dp.update();
        flash("exito","Operacion exitosa!");

        //y tambien tenemos que recalcular detalle de pago :(
        final Motorista motorista = dp.motorista;
        Thread m = new Thread(new Runnable() {
            public void run() {
                LogisticaController.recalcularDetallePago(motorista);
            }
        });
        m.start();

        return redirect(routes.GerenteController.planilla_show(dp.periodo_planilla.id));
    }



    public Result asignar_bonos(){

        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/

        PeriodoPlanilla actual=PeriodoPlanilla.find.where().eq("actual",true).findUnique();

        if(actual==null){
            flash("error","No se contro ningun periodo actual al intentar actualizar bonos");
            return badRequest(errores.render());
        }

        List<DetallePago> dps = DetallePago.find.where().eq("periodo_planilla",actual).findList();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        for(DetallePago dp : dps){
            
            String valor="";
            if(values.containsKey("todos")){
                valor=values.get("bono[global]")[0];
            }else{
                valor = values.get("bono["+dp.id+"]")[0];
            }
            

            if(valor==null){
                flash("modal","mod-bono-global");
                flash("error","Debe ingresar un valor para bono, asegurese de no dejar campos vacios");
                return redirect(routes.GerenteController.planilla_show(actual.id));
            }else{
                if(valor.isEmpty()){
                    flash("modal","mod-bono-global");
                    flash("error","Debe ingresar un valor para bono, asegurese de no dejar campos vacios");
                    return redirect(routes.GerenteController.planilla_show(actual.id));
                }
            }
            

            dp.bono=Double.valueOf(valor);
            dp.update();
            

            //y tambien tenemos que recalcular detalle de pago :(
            final Motorista motorista = dp.motorista;
            Thread m = new Thread(new Runnable() {
                public void run() {
                    LogisticaController.recalcularDetallePago(motorista);
                }
            });
            m.start();
        } 
        flash("exito","Operacion exitosa!");
        return redirect(routes.GerenteController.planilla_show(actual.id));
    }



    public Result politica_cobro() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/


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



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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
        


        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Usuario> usuario_form = Form.form(Usuario.class);
        List<Usuario> usuarios_list = Usuario.find.findList();
        return ok(usuarios.render(usuario_form,usuarios_list));
    }

    //add
    public Result usuario_new() {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



        Form<Usuario> usuario_form = Form.form(Usuario.class).bindFromRequest();
        Map<String, String[]> values = request().body().asFormUrlEncoded();
        List<Usuario> usuarios_list = Usuario.find.findList();

        //Si hay errores siempre los retornara
        if( usuario_form.hasErrors() ){
            flash("modal","mod-new");
            return badRequest(usuarios.render(usuario_form,usuarios_list));
        }
        if( Usuario.find.where().eq("username",values.get("username")[0]).findUnique()!=null){
            flash("error","El usuario ya existe");
            flash("modal","mod-new");
            return redirect(routes.GerenteController.usuarios());
        }

        Usuario nuevo = usuario_form.get();
        nuevo.save();

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.usuarios());
    }

    //edit
    public Result usuario_edit(Long id) {



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/



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
            if(!user.username.equals(usuario_form.get().username)){
                if( Usuario.find.where().eq("username",user.username).findUnique()!=null){
                    flash("error","El usuario ya existe");
                    flash("modal","mod-edit-"+id.toString());
                    return redirect(routes.GerenteController.usuarios());
                }
            }
            
            user.password=usuario_form.get().password;
            user.tipo.id=usuario_form.get().tipo.id;

            user.update();
        }        

        flash("exito","Operacion exitosa!");

        return redirect(routes.GerenteController.usuarios());
    }
    //remove
    public Result usuario_remove(Long id){



        /*validacion de usuario logeado*/
        String connected = session("username");
        
        if(connected == null){
           return redirect(routes.HomeController.login());
        }else{
            Usuario u = Usuario.find.where().eq("username",connected).findUnique();
            if(u==null){
                return redirect(routes.HomeController.login());         
            }else{
                if( !u.tipo.codigo.equals( 2 )){

                    flash("error","Permisos denegados para el usuario");

                    if(u.tipo.codigo.intValue()==1){
                        return badRequest(views.html.administrador.errores.render());
                    }else{
                        if(u.tipo.codigo.intValue()==2){
                            return badRequest(views.html.gerente.errores.render());
                        }else{
                            return badRequest(views.html.logistica.errores.render());
                        }
                    }                    
                }
            }
        } 
        /*validacion de usuario logeado*/
        

        
        Usuario user = Usuario.find.byId(id);
        if(user != null){
            user.delete();
            flash("exito","Operacion exitosa!");
            return redirect(routes.GerenteController.usuarios());
        }
        return redirect(routes.GerenteController.usuarios());
    }
}
