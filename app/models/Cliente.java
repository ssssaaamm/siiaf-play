package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="cliente")
public class Cliente extends Model{
	@Id
	public Long id;
	
	@Constraints.Required(message="Debe ingresar el nombre")
	public String nombre;

	@Constraints.Required(message="Debe ingresar NIT de la empresa")
	public String nit;	
	
	@Constraints.Required(message="Debe ingresar una descripcion")
	public String descripcion;

	public boolean activo=true;

	@OneToMany(mappedBy="cliente")
	public List<Viaje> viajes;

	@OneToMany(mappedBy="cliente")
	public List<DetalleCobro> detalles_cobro;

	public static Finder<Long, Cliente> find = new Finder<Long,Cliente>(Cliente.class);

    public Form<Cliente> getForm(){
    	Cliente c = Cliente.find.byId(this.id);
    	Form<Cliente> returning=Form.form(Cliente.class).fill(c);
    	return returning;
    }

    public static Map<String,String> options(){
	  	LinkedHashMap<String,String> opciones = new LinkedHashMap<String,String>();
	  	//List<Categoria> categorias=Categoria.find.orderBy("nombre").findList();
	  	for(Cliente c : Cliente.find.orderBy("nombre").findList()){
	  		opciones.put(c.id.toString(), c.nombre);
	  	}
	  	return opciones;
	  }
		
}