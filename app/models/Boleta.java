package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
@Table(name="boleta")
public class Boleta extends Model{
	@Id
	public Long id;

	@Constraints.Required(message="Debe ingresar el codigo de boleta")
	public String codigo;

	@Constraints.Required(message="Debe ingresar un destino")
	public String destino;

	@Constraints.Required(message="Debe ingresar los km asignados a este viaje")
	public Double km_asignados;
	
	@Constraints.Required(message="Debe ingresar un tipo de carga")
	public Integer tipo_carga;

	@Constraints.Required(message="Debe seleccionar el sentido del viaje")
	public Integer sentido;

	public Boolean sobrepeso=false;

	public Boolean cruce_frontera=false;

	@ManyToOne
	public Viaje viaje;
	
}