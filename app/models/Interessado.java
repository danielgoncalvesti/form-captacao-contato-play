package models;


import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by danielgoncalvesti on 17/05/17.
 */
@Entity
public class Interessado extends Model{
    @Id
    public Long id;
    @Constraints.Required
    public String nome;
    @Constraints.Required
    public String email;
    @Constraints.Required
    public Integer conhecimentoJava;





}
