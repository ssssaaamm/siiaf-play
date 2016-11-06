package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.*;
import java.io.File;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
//import java.nio.Files;

import views.html.administrador.*;
import models.*;

public class AdministradorController extends Controller {


	///EMPLEADOS

	//list
    public Result usuarios() {
        
        return ok(usuarios.render());
    }


    //add
    public Result usuarios_new() {

    	return ok("usuario new");
    }


    //edit
    public Result usuario_edit(Long id) {

    	return ok("edit suario");
    }


    //delete
    public Result usuario_remove(Long id){
    	return ok("usuario remove");
    }


}//cierre de clase