package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="periodo_planilla")
public class PeriodoPlanilla extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe seleccionar una fecha de inicio")
	public Date fecha_inicio;

	@Constraints.Required(message="Debe seleccionar una fecha de finalización")
	public Date fecha_fin;

	public Boolean actual;
	
	@ManyToOne
	public PoliticaPago politica_pago;

	@OneToMany(mappedBy="periodo_planilla")
	public List<DetallePago> detalle_pagos;

	@OneToMany(mappedBy="periodo_planilla")
	public List<Viaje> viajes;

	public static Finder<Long, PeriodoPlanilla> find = new Finder<Long,PeriodoPlanilla>(PeriodoPlanilla.class);

    public Form<PeriodoPlanilla> getForm(){
    	PeriodoPlanilla pp = PeriodoPlanilla.find.byId(this.id);
    	Form<PeriodoPlanilla> returning=Form.form(PeriodoPlanilla.class).fill(pp);
    	return returning;
    }


}
	