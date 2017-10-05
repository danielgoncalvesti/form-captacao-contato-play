package models;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import play.data.validation.Constraints;
import com.avaje.ebean.Model;

@Entity
public class ConhecimentoJava extends Model {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;

	public String descricao;

	public ConhecimentoJava(Long id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}
	
	public static Model.Finder<Integer, ConhecimentoJava> find = new Model.Finder<Integer, ConhecimentoJava>(ConhecimentoJava.class);
	
	public static Map<String, String> options(){
		LinkedHashMap<String, String> options = null;
		options = new LinkedHashMap<String, String>();
		for(ConhecimentoJava cj : ConhecimentoJava.find.all()){
			options.put(cj.id.toString(), cj.descricao);
		}
		return options;
	}
	
}
