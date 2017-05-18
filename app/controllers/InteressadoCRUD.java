package controllers;


import javax.inject.Inject;

import models.Interessado;
import models.InteressadoHelper;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by danielgoncalvesti on 17/05/17.
 */
public class InteressadoCRUD extends Controller {

    private final Form<Interessado> interessadoForm;

    @Inject
    public InteressadoCRUD(FormFactory formFactory){
        this.interessadoForm = formFactory.form(Interessado.class);
    }

    public Result index(){
        Form<Interessado> form = interessadoForm.fill(new Interessado());
        return ok(index.render("Index", form));
    }

    public Result add(){
    	Form<Interessado> form = interessadoForm.bindFromRequest();
    	InteressadoHelper.salvar(form.get());
        return TODO;
    }


}
