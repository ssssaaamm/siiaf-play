package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="cabezal", uniqueConstraints= @UniqueConstraint(columnNames={"placa"})
	)
public class Cabezal extends Model{
	@Id
	public Long id;
	
	@Column(length=10)	
	@Constraints.Required(message="Debe ingresar una placa para el cabezal")
	public String placa;
	
	@Column(length=20)	
	@Constraints.Required(message="Debe ingresar un número de chasis para el cabezal")
	public String chasis;

	@Column(length=20)	
	@Constraints.Required(message="Debe ingresar un número de motor para el cabezal")
	public String motor;

	@Column(length=4)	
	@Constraints.Required(message="Debe ingresar una año para el cabezal")
	public String año;

	@Column(length=10)	
	@Constraints.Required(message="Debe ingresar un color")
	public String color;

	@Column(length=150)		
	@Constraints.Required(message="Debe ingresar una descripción")
	public String descripcion;

	public boolean activo=true;

	@Lob
	public byte[] imgCabezal;

	//@Column(length=3)
	public String contentTypeImgCabezal;

	@Lob
	public byte[] imgTarjeta;

	//@Column(length=3)
	public String contentTypeImgTarjeta;

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