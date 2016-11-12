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
        return ok(index.render());
    }


    public Result login() {
        return ok(login.render());
    }


    public Result login_post() {
        Map<String, String[]> values = request().body().asFormUrlEncoded();

        String username=values.get("username")[0];
        String password=values.get("password")[0];


        Usuario u = Usuario.find.where().eq("username",username).findUnique();

        if(u ==null ){
            flash("no_registered","Usuario '"+username+"' no registrado");
            return redirect(routes.HomeController.login());
        }else{
            
            if( u.password.equals(password) ){
                //return ok("empleado registrado y password concuerda");
                if(u.tipo.codigo == 1){//admin
                    session("username",username);
                    return redirect(routes.AdministradorController.usuarios());
                }

                if(u.tipo.codigo == 2){//gerente
                    session("username",username);
                    return redirect(routes.GerenteController.clientes());
                }

                if(u.tipo.codigo == 3){//gerente
                    session("username",username);
                    return redirect(routes.LogisticaController.viajes());
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
        session().clear();
        return redirect(routes.HomeController.index());
    }


    public Result set_password() {

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
        return redirect(routes.HomeController.index());

    }

}
