package models;

import javax.persistence.*;
import javax.validation.Constraint;

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
    public String nome;
    
    @Constraints.Required(message = "Este campo é obrigatório.")
    @Constraints.Email(message = "Por favor, adicione um email válido.")
    public String email;
    
//    @Constraints.Required
//    public Integer idade;

    @JoinColumn(name="conhecimentojava_id", referencedColumnName="id")
    @Constraints.Required(message="teste")
    public ConhecimentoJava conhecimentoJava;

    public Interessado(String nome, String email, ConhecimentoJava cj){
        this.nome = nome;
        this.email = email;
        this.conhecimentoJava = cj;
    }

    public ConhecimentoJava getConhecimentoJava() {
        return conhecimentoJava;
    }

    public void setConhecimentoJava(ConhecimentoJava conhecimentoJava) {
        this.conhecimentoJava = conhecimentoJava;
    }

    public static Finder<Long, ConhecimentoJava> find = new Finder<Long,ConhecimentoJava>(ConhecimentoJava.class);

    public List<ValidationError> validate() {
        List<ValidationError> errors = new ArrayList<ValidationError>();
        if (nome == null || nome.equals("")) {
            errors.add(new ValidationError("conhecimeentoJava", "This e-mail is already registered."));
        }
        return errors.isEmpty() ? null : errors;
    }

}
