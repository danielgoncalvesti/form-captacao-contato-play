package controllers;


import javax.inject.Inject;
import models.Interessado;
import models.InteressadoHelper;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by danielgoncalvesti on 17/05/17.
 */
public class InteressadoCRUD extends Controller {

    @Inject
    FormCreator formCreator = new FormCreator();

//    public InteressadoCRUD(FormFactory formFactory){
//        this.interessadoForm = formFactory.form(Interessado.class);
//    }

    public Result index(){
        Form<Interessado> form = Form.form(Interessado.class);
        return ok(views.html.index.render("Index", form));
    }

    public Result add(){
        Form<Interessado> form = Form.form(Interessado.class).bindFromRequest();

        if(form.hasErrors()){
            flash("error", "Por favor, complete os campos abaixo!");
            return badRequest(views.html.index.render("Index", form));
        }
        //verifica se email já está cadastrado
        if(InteressadoHelper.getInteressadoByEmail(form.get().email).size() > 0){
            flash("error", "Email já cadastrado!");
            return badRequest(views.html.index.render("Index", form));
        }
    	InteressadoHelper.salvar(form.get());
    	Logger.info("--Inscrição Realizada--");
    	Logger.info("NOME: "+form.get().nome + " " + "EMAIL: "+ form.get().email);
    	Logger.info("-----------------------");
    	flash("success", "Inscrição  realizada com sucesso!");
        //return redirect ("/");
        return ok(views.html.index.render("Index", form));
    }

//    public static void validationErrorExamples() {
//
//
//        //#validation-error-examples
//        // Global error without internationalization:
//        new ValidationError("nome", "Errors occured. Please check your input!");
//        // Global error; "validationFailed" should be defined in `conf/messages` - taking two arguments:
//
//    }

}
