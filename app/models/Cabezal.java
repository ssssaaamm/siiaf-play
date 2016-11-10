package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="cabezal")
public class Cabezal extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar una placa para el cabezal")
	public String placa;
	
	@Constraints.Required(message="Debe ingresar una descripcion")
	public String descripcion;

	public boolean activo=true;

	public static Finder<Long, Cabezal> find = new Finder<Long,Cabezal>(Cabezal.class);

    public Form<Cabezal> getForm(){
    	Cabezal c = Cabezal.find.byId(this.id);
    	Form<Cabezal> returning=Form.form(Cabezal.class).fill(c);
    	return returning;
    }


    public static Map<String,String> options(){
	  	LinkedHashMap<String,String> opciones = new LinkedHashMap<String,String>();
	  	//List<Categoria> categorias=Categoria.find.orderBy("nombre").findList();
	  	for(Cabezal c : Cabezal.find.orderBy("placa").findList()){
	  		opciones.put(c.id.toString(), c.placa);
	  	}
	  	return opciones;
	}
	
}