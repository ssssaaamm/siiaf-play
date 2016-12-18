package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="periodo_facturacion")
public class PeriodoFacturacion extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe seleccionar una fecha de inicio")
	public Date fecha_inicio;

	@Constraints.Required(message="Debe seleccionar una fecha de finalización")
	public Date fecha_fin;

	public Boolean actual;
	
	@ManyToOne
	public PoliticaCobro politica_cobro;

	@OneToMany(mappedBy="periodo_facturacion")
	public List<DetalleCobro> detalle_cobros;

	@OneToMany(mappedBy="periodo_facturacion")
	public List<Viaje> viajes;

	public static Finder<Long, PeriodoFacturacion> find = new Finder<Long,PeriodoFacturacion>(PeriodoFacturacion.class);

    public Form<PeriodoFacturacion> getForm(){
    	PeriodoFacturacion pf = PeriodoFacturacion.find.byId(this.id);
    	Form<PeriodoFacturacion> returning=Form.form(PeriodoFacturacion.class).fill(pf);
    	return returning;
    }
}
	