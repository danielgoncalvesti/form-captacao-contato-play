package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints;

import com.avaje.ebean.Model;


/**
 * Created by danielgoncalvesti on 17/05/17.
 */
@Entity
public class Interessado extends Model{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;
    
    @Constraints.Required
    public String nome;
    
    @Constraints.Required
    public String email;
    
//    @Constraints.Required
//    public Integer idade;
    
    @ManyToOne
    public ConhecimentoJava conhecimentoJava;
    
    





}
