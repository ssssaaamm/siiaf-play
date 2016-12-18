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

	public Integer total_viajes_locales=0;

	public Double total_km_locales=0.0;

	public Double total_monto_locales=0.0;

	public Integer total_viajes_internacionales=0;

	public Double total_km_internacionales=0.0;
	
	public Double total_monto_internacionales=0.0;
		
	public Integer total_cantidad_agregados=0;

	public Double total_monto_agregados=0.0;

	public Integer total_cantidad_viaticos_vv=0;

	public Integer total_cantidad_viaticos_vc=0;

	public Integer total_cantidad_viaticos_cc=0;

	public Integer total_cantidad_viaticos=0;

	public Double total_monto_viaticos_vv=0.0;

	public Double total_monto_viaticos_vc=0.0;

	public Double total_monto_viaticos_cc=0.0;

	public Double total_monto_viaticos=0.0;

	public Double salario_ganado=0.0;

	public Double delta_salario_minimo=0.0;

	public Double bono=0.0;

	public Double total_pago_periodo=0.0;

	public Double isss=0.0;

	public Double afp=0.0;

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