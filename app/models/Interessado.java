package models;

import javax.persistence.*;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;
import play.data.validation.ValidationError;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielgoncalvesti on 17/05/17.
 */

@Entity
public class Interessado extends Model{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @Constraints.Required(message = "Este campo é obrigatório.")
    public String primeiroNome;

    @Constraints.Required(message = "Este campo é obrigatório.")
    public String sobrenome;
    
    @Constraints.Required(message = "Este campo é obrigatório.")
    @Constraints.Email(message = "")
    public String email;

    @ManyToOne
    @JoinColumn(name="conhecimentojava_id", referencedColumnName="id")
    @Constraints.Required(message="teste")
    public ConhecimentoJava conhecimentoJava;

    public Interessado(String primeiroNome, String sobrenome, String email, ConhecimentoJava cj){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.conhecimentoJava = cj;
    }

    public ConhecimentoJava getConhecimentoJava() {
        return conhecimentoJava;
    }

    public void setConhecimentoJava(ConhecimentoJava conhecimentoJava) {
        this.conhecimentoJava = conhecimentoJava;
    }

    public static Finder<Long, Interessado> find = new Finder<Long,Interessado>(Interessado.class);

    public List<ValidationError> validate() {
        List<ValidationError> errors = new ArrayList<ValidationError>();
        if ((primeiroNome == null || primeiroNome.equals("")) && (sobrenome == null || sobrenome.equals(""))) {
            errors.add(new ValidationError("conhecimeentoJava", "This e-mail is already registered."));
        }
        return errors.isEmpty() ? null : errors;
    }

}
