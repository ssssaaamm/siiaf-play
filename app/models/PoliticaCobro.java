package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="politica_cobro")
public class PoliticaCobro extends Model{
	@Id
	public Long id;

	public Boolean actual;

	@Constraints.Required(message="Debe ingresar un periodo")
	public Integer duracion_periodo;
		
	@Constraints.Required(message="Debe ingresar tarifa de cobro Sencillo")
	public Double tarifa_cobro_km_sen;


	@Constraints.Required(message="Debe ingresar tarifa de cobro cargado")
	public Double tarifa_cobro_km_car;


	@Constraints.Required(message="Debe ingresar tarifa de cobro vacio")
	public Double tarifa_cobro_km_vac;


	@Constraints.Required(message="Debe ingresar tarifa para tarifa sobrepeso")
	public Double tarifa_sobrepeso;
	
	@Constraints.Required(message="Debe ingresar tarifa para cruce de frontera")
	public Double tarifa_cruce_frontera;
	
	@OneToMany(mappedBy="politica_cobro")
	public List<PeriodoFacturacion> periodos_facturacion;

	public static Finder<Long, PoliticaCobro> find = new Finder<Long,PoliticaCobro>(PoliticaCobro.class);

    public Form<PoliticaCobro> getForm(){
    	PoliticaCobro pc = PoliticaCobro.find.byId(this.id);
    	Form<PoliticaCobro> returning=Form.form(PoliticaCobro.class).fill(pc);
    	return returning;
    }
		
}