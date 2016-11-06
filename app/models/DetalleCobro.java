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

	public Integer total_viajes_locales;

	public Double total_km_sen_locales;

	public Double total_km_car_locales;

	public Double total_km_vac_locales;

	public Double total_km_locales;

	public Double total_mont_sen_locales;

	public Double total_mont_car_locales;

	public Double total_mont_vac_locales;

	public Double total_mont_locales;

	public Integer total_viajes_internacionales;

	public Double total_km_sen_internacionales;
	
	public Double total_km_car_internacionales;

	public Double total_km_vac_internacionales;

	public Double total_km_internacionales;
	
	public Double total_mont_sen_internacionales;

	public Double total_mont_car_internacionales;

	public Double total_mont_vac_internacionales;

	public Double total_mont_internacionales;
		
	public Integer total_cantidad_agregados;

	public Double total_mont_agregados;

	
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