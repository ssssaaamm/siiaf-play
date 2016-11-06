package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="detalle_pago")
public class DetallePago extends Model{
	@Id
	public Long id;

	public Integer total_viajes_locales;

	public Double total_km_locales;

	public Double total_monto_locales;

	public Integer total_viajes_internacionales;

	public Double total_km_internacionales;
	
	public Double total_monto_internacionales;
		
	public Integer total_cantidad_agregados;

	public Double total_monto_agregados;

	public Integer total_cantidad_viaticos_vv;

	public Integer total_cantidad_viaticos_vc;

	public Integer total_cantidad_viaticos_cc;

	public Integer total_cantidad_viaticos;

	public Double total_monto_viaticos_vv;

	public Double total_monto_viaticos_vc;

	public Double total_monto_viaticos_cc;

	public Double total_monto_viaticos;

	public Double salario_ganado;

	public Double delta_salario_minimo;

	public Double bono;

	public Double total_pago_periodo;

	public Double isss;

	public Double afp;

	@ManyToOne
	public Motorista motorista;

	@ManyToOne
	public PeriodoPlanilla periodo_planilla;

	public static Finder<Long, DetallePago> find = new Finder<Long,DetallePago>(DetallePago.class);

    public Form<DetallePago> getForm(){
    	DetallePago dp = DetallePago.find.byId(this.id);
    	Form<DetallePago> returning=Form.form(DetallePago.class).fill(dp);
    	return returning;
    }
		
}