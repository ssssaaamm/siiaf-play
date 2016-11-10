package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="motorista")
public class Motorista extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar un codigo")
	public String codigo;

	@Constraints.Required(message="Debe ingresar el nombre")
	public String nombre;

	@Constraints.Required(message="Debe ingresar un número de DUI")
	public String dui;

	@Constraints.Required(message="Debe ingresar un número de NIT")
	public String nit;
	
	
	@Constraints.Required(message="Debe ingresar un número de licencia")
	public String licencia;

	public boolean activo=true;
	
	@OneToMany
	public List<DetallePago> detalle_pagos;

	@OneToMany(mappedBy="motorista")
	public List<Viaje> viajes;

	public static Finder<Long, Motorista> find = new Finder<Long,Motorista>(Motorista.class);

    public Form<Motorista> getForm(){
    	Motorista m = Motorista.find.byId(this.id);
    	Form<Motorista> returning=Form.form(Motorista.class).fill(m);
    	return returning;
    }

    public static Map<String,String> options(){
	  	LinkedHashMap<String,String> opciones = new LinkedHashMap<String,String>();
	  	//List<Categoria> categorias=Categoria.find.orderBy("nombre").findList();
	  	for(Motorista c : Motorista.find.orderBy("nombre").findList()){
	  		opciones.put(c.id.toString(), c.nombre);
	  	}
	  	return opciones;
	  }
	
}