package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="detalle_cobro")
public class DetalleCobro extends Model{
	@Id
	public Long id;

	public Integer total_viajes_locales=0;

	public Double total_km_sen_locales=0.0;

	public Double total_km_car_locales=0.0;

	public Double total_km_vac_locales=0.0;

	public Double total_km_locales=0.0;

	public Double total_mont_sen_locales=0.0;

	public Double total_mont_car_locales=0.0;

	public Double total_mont_vac_locales=0.0;

	public Double total_mont_locales=0.0;

	public Integer total_viajes_internacionales=0;

	public Double total_km_sen_internacionales=0.0;
	
	public Double total_km_car_internacionales=0.0;

	public Double total_km_vac_internacionales=0.0;

	public Double total_km_internacionales=0.0;
	
	public Double total_mont_sen_internacionales=0.0;

	public Double total_mont_car_internacionales=0.0;

	public Double total_mont_vac_internacionales=0.0;

	public Double total_mont_internacionales=0.0;
		
	public Integer total_cantidad_agregados=0;

	public Double total_mont_agregados=0.0;

	public Double total_cobro_periodo=0.0;

	
	@ManyToOne
	public PeriodoFacturacion periodo_facturacion;
	
	@ManyToOne
	public Cliente cliente;	


	public static Finder<Long, DetalleCobro> find = new Finder<Long,DetalleCobro>(DetalleCobro.class);

    public Form<DetalleCobro> getForm(){
    	DetalleCobro dc = DetalleCobro.find.byId(this.id);
    	Form<DetalleCobro> returning=Form.form(DetalleCobro.class).fill(dc);
    	return returning;
    }
}