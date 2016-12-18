package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="politica_pago")
public class PoliticaPago extends Model{
	@Id
	public Long id;

	public Boolean actual;

	@Constraints.Required(message="Debe ingresar un periodo")
	public Integer duracion_periodo;
		
	@Constraints.Required(message="Debe ingresar el salario salario_minimo")
	public Double salario_minimo;
	
	@Constraints.Required(message="Debe ingresar el porcentaje isss")
	public Double porcentaje_isss;

	@Constraints.Required(message="Debe ingresar el porcentaje afp")
	public Double porcentaje_afp;
		
	@Constraints.Required(message="Debe ingresar tarifa de pago viaje local")
	public Double tarifa_pago_km_loc;

	@Constraints.Required(message="Debe ingresar tarifa de pago viaje internacional")
	public Double tarifa_pago_km_int;
	
	@Constraints.Required(message="Debe ingresar tarifa para tarifa sobrepeso")
	public Double porcentaje_sobrepeso;

	@Constraints.Required(message="Debe ingresar tarifa de pago vacio/vacio")
	public Double tarifa_viatico_vv;

	@Constraints.Required(message="Debe ingresar tarifa de pago vacio/cargado")
	public Double tarifa_viatico_vc;

	@Constraints.Required(message="Debe ingresar tarifa de pago cargado/cargado")
	public Double tarifa_viatico_cc;

	@OneToMany(mappedBy="politica_pago")
	public List<PeriodoPlanilla> periodos_planillas;

	public static Finder<Long, PoliticaPago> find = new Finder<Long,PoliticaPago>(PoliticaPago.class);

    public Form<PoliticaPago> getForm(){
    	PoliticaPago pp = PoliticaPago.find.byId(this.id);
    	Form<PoliticaPago> returning=Form.form(PoliticaPago.class).fill(pp);
    	return returning;
    }
		
}