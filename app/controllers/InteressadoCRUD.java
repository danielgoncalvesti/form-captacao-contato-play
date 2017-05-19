package controllers;


import javax.inject.Inject;

import models.Interessado;
import models.InteressadoHelper;
import play.Logger;

import play.data.Form;
import play.data.FormFactory;
import play.data.format.Formatters;
import play.data.validation.ValidationError;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.defaultpages.error;
import views.html.index;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        return ok(index.render("Index", form));
    }

    public Result add(){
        Form<Interessado> form = Form.form(Interessado.class).bindFromRequest();

        if(form.hasErrors()){

            flash("error", "Por favor, complete os campos abaixo!");
            return badRequest(index.render("Index", form));
        }
    	InteressadoHelper.salvar(form.get());
    	flash("success", form.get().nome + " sua inscrição foi realizada com sucesso!");
        //return redirect ("/");
        return ok(index.render("Index", form));
    }


    public static void validationErrorExamples() {


        //#validation-error-examples
        // Global error without internationalization:
        new ValidationError("nome", "Errors occured. Please check your input!");
        // Global error; "validationFailed" should be defined in `conf/messages` - taking two arguments:

    }

}
