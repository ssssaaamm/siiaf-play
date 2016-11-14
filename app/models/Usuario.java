package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.*;

import com.avaje.ebean.*;

@Entity
@Table(name="usuario",uniqueConstraints= @UniqueConstraint(columnNames={"username"}))
public class Usuario extends Model{
	@Id
	public Long id;

	@Column(length=50)
	@Constraints.Required(message="Debe ingresar el nombre")
	public String nombre;


	@Column(length=50)
	@Constraints.Required(message="Debe ingresar un nick o username")
	public String username;

	@Column(length=50)
	@Constraints.Required(message="Debe ingresar la contraseña")
	public String password;

	@Column(length=50)
	@Transient
	public String password_confirmation;

	@ManyToOne
	public TipoUsuario tipo;
	
    public static Finder<Long, Usuario> find = new Finder<Long,Usuario>(Usuario.class);

    public Form<Usuario> getForm(){
    	Usuario e = Usuario.find.byId(this.id);
    	e.password_confirmation=e.password;
    	Form<Usuario> returning=Form.form(Usuario.class).fill(e);
    	return returning;
    }

    public List<ValidationError> validate(){
	   List<ValidationError> errors = new ArrayList<ValidationError>();
	   if(!password.equals(password_confirmation)){
	       errors.add(new ValidationError("password_confirmation", "Las contraseñas deben ser iguales"));
	    }
	    return errors.isEmpty() ? null : errors;
	}


}