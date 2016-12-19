package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.io.File;

import views.html.*;
import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        /*validacion de usuario logeado*/
        String username = session("username");
        
        if(username != null){
            Usuario u = Usuario.find.where().eq("username",username).findUnique();
            if(u!=null){

                if(u.tipo.codigo == 1){//admin
                    return redirect(routes.AdministradorController.home());
                }

                if(u.tipo.codigo == 2){//gerente
                    return redirect(routes.GerenteController.home());
                }

                if(u.tipo.codigo == 3){//logistica
                    return redirect(routes.LogisticaController.home());
                }
            }
        }
        /*validacion de usuario logeado*/

        return ok(index.render());
    }


    public Result login() {

        /*validacion de usuario logeado*/
        String username = session("username");
        
        if(username != null){
            Usuario u = Usuario.find.where().eq("username",username).findUnique();
            if(u!=null){

                if(u.tipo.codigo == 1){//admin
                    return redirect(routes.AdministradorController.home());
                }

                if(u.tipo.codigo == 2){//gerente
                    return redirect(routes.GerenteController.home());
                }

                if(u.tipo.codigo == 3){//logistica
                    return redirect(routes.LogisticaController.home());
                }
            }
        }
        /*validacion de usuario logeado*/
        return ok(login.render());
    }


    public Result login_post() {
        /*validacion de usuario logeado*/
        String username = session("username");
        
        if(username != null){
            Usuario u = Usuario.find.where().eq("username",username).findUnique();
            if(u!=null){

                if(u.tipo.codigo == 1){//admin
                    return redirect(routes.AdministradorController.home());
                }

                if(u.tipo.codigo == 2){//gerente
                    return redirect(routes.GerenteController.home());
                }

                if(u.tipo.codigo == 3){//logistica
                    return redirect(routes.LogisticaController.home());
                }
            }
        }
        /*validacion de usuario logeado*/

        Map<String, String[]> values = request().body().asFormUrlEncoded();

        username=values.get("username")[0];
        String password=values.get("password")[0];


        Usuario u = Usuario.find.where().eq("username",username).findUnique();


        if(u ==null ){
            flash("no_registered","Usuario '"+username+"' no registrado");
            return redirect(routes.HomeController.login());
        }else{

            if(u.username.compareTo(username) != 0){
                flash("no_registered","Usuario '"+username+"' no registrado");
                return redirect(routes.HomeController.login());
            }
            
            if( u.password.compareTo(password)==0 ){
                //return ok("empleado registrado y password concuerda");
                if(u.tipo.codigo == 1){//admin
                    session("username",username);
                    return redirect(routes.AdministradorController.home());
                }

                if(u.tipo.codigo == 2){//gerente
                    session("username",username);
                    return redirect(routes.GerenteController.home());
                }

                if(u.tipo.codigo == 3){//gerente
                    session("username",username);
                    return redirect(routes.LogisticaController.home());
                }

            }else{
                flash("no_password","Contraseña invalida");
                return redirect(routes.HomeController.login());
            }
            
        }

        return null;

    }

    public Result about() {
        return ok(about.render());
    }

    public Result logout() {


        /*validacion de usuario logeado*/
        String username = session("username");
        
        if(username == null){
            return redirect(routes.HomeController.login());
        }
        /*validacion de usuario logeado*/


        session().clear();
        return redirect(routes.HomeController.login());
    }


    public Result set_password() {

        /*validacion de usuario logeado*/
        String username = session("username");
        
        if(username == null){
            return redirect(routes.HomeController.login());
        }
        /*validacion de usuario logeado*/

        Map<String, String[]> values = request().body().asFormUrlEncoded();

        

        String old=values.get("old")[0];
        String nueva=values.get("new")[0];
        String confirmation=values.get("confirmation")[0];

        

        Usuario u=Usuario.find.where().eq("username",session().get("username")).findUnique();



        if(u!=null && old!=null && nueva!=null && confirmation!=null){
            if(!old.isEmpty() && !nueva.isEmpty() && !confirmation.isEmpty()){
                if(old.equals(u.password)){
                    //cambiar contraseña
                    if(nueva.equals(confirmation)){
                        u.password=nueva;
                        u.update();
                        session().clear();
                        return redirect(routes.HomeController.login());
                    }else{
                        //passwords no concuerdan
                        flash("modal","mod-password");
                        flash("password_error","Passwords no concuerdan");

                        if(u.tipo.codigo == 1){//admin
                            return redirect(routes.AdministradorController.usuarios());
                        }

                        if(u.tipo.codigo == 2){//gerente
                            return redirect(routes.GerenteController.clientes());
                        }

                        if(u.tipo.codigo == 3){//logistica
                            return redirect(routes.LogisticaController.viajes());
                        }
                    }

                }else{
                    flash("modal","mod-password");
                    flash("password_error","Contraseña antigua invalida");
                    if(u.tipo.codigo == 1){//admin
                        return redirect(routes.AdministradorController.usuarios());
                    }

                    if(u.tipo.codigo == 2){//gerente
                        return redirect(routes.GerenteController.clientes());
                    }

                    if(u.tipo.codigo == 3){//logistica
                        return redirect(routes.LogisticaController.viajes());
                    }
                }
            }else{
                flash("modal","mod-password");
                flash("password_error","Operacion invalida");
                if(u.tipo.codigo == 1){//admin
                    return redirect(routes.AdministradorController.usuarios());
                }

                if(u.tipo.codigo == 2){//gerente
                    return redirect(routes.GerenteController.clientes());
                }

                if(u.tipo.codigo == 3){//logistica
                    return redirect(routes.LogisticaController.viajes());
                }
            }
        }else{
            flash("modal","mod-password");
            flash("password_error","Operacion invalida");
            if(u.tipo.codigo == 1){//admin
                return redirect(routes.AdministradorController.usuarios());
            }

            if(u.tipo.codigo == 2){//gerente
                return redirect(routes.GerenteController.clientes());
            }

            if(u.tipo.codigo == 3){//logistica
                return redirect(routes.LogisticaController.viajes());
            }
        } 

        session().clear();
        return redirect(routes.HomeController.login());

    }

}
