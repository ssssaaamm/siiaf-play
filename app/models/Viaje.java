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
	//@Column(length=1)
	public Integer tipo; 

	@Formats.DateTime(pattern="dd/mm/yyyy")
	public Date fecha_registro;
	
	public Double total_km;
	
	public Boolean viaticos=false;

	//@Column(length=2)
	public Integer tipo_viatico;
	
	@ManyToOne
	public PeriodoFacturacion periodo_facturacion;

	@ManyToOne
	public PeriodoPlanilla periodo_planilla;

	@Constraints.Required(message="Debe ingresar un motorista")
	@ManyToOne
	public Motorista motorista;

	@Constraints.Required(message="Debe ingresar un motorista")
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