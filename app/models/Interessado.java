package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.format.Formats;
import play.data.validation.Constraints;

import com.avaje.ebean.Model;
import play.data.validation.ValidationError;
import play.i18n.Messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by danielgoncalvesti on 17/05/17.
 */

@Entity
public class Interessado extends Model{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    @Formats.NonEmpty
    @Constraints.Required(message = "Este campo é obrigatório.")
    public String nome;
    
    @Constraints.Required(message = "Este campo é obrigatório.")
    public String email;
    
//    @Constraints.Required
//    public Integer idade;
    
    @ManyToOne
    public ConhecimentoJava conhecimentoJava;

    public Interessado(String nome, String email, ConhecimentoJava cj){
        this.nome = nome;
        this.email = email;
        this.conhecimentoJava = cj;
    }

    public List<ValidationError> validate() {
        List<ValidationError> errors = new ArrayList<ValidationError>();
        if (nome == null || nome.equals("")) {
            errors.add(new ValidationError("nome", "This e-mail is already registered."));
        }
        return errors.isEmpty() ? null : errors;
    }





}
