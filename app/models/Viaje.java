package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="viaje")
public class Viaje extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar un tipo de viaje")
	public String tipo;

	@Constraints.Required(message="Debe ingresar una fecha")
	public Date fecha_registro;
	
	@Constraints.Required(message="Incluir el total de kilometros")
	public Double total_km;

	public Boolean viaticos;

	@Constraints.Required(message="Debe ingresar un tipo de viaticos")
	public String tipo_viatico;
	
	@ManyToOne
	public PeriodoFacturacion periodo_facturacion;

	@ManyToOne
	public PeriodoPlanilla periodo_planilla;

	@ManyToOne
	public Motorista motorista;

	@ManyToOne 
	public Cabezal cabezal;
	
	@OneToMany(mappedBy="viaje")
	public List<Boleta> boletas;

	public static Finder<Long, Viaje> find = new Finder<Long,Viaje>(Viaje.class);

    public Form<Viaje> getForm(){
    	Viaje v = Viaje.find.byId(this.id);
    	Form<Viaje> returning=Form.form(Viaje.class).fill(v);
    	return returning;
    }

}