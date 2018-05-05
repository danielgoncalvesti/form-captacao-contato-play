package controllers;

import models.Interessado;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.*;
import services.*;
import javax.inject.Inject;
import java.util.List;

public class MailerController extends Controller {
    MailerService mailerClient;

    @Inject
    public MailerController (MailerService mailer) {
        this.mailerClient = mailer;
    }

    public Result sendMail() {
        List<Interessado> all = models.InteressadoHelper.getInteressadoAll();
        for(Interessado x: all){
            System.out.println(x.conhecimentoJava.id);
        }
        mailerClient.sendEmail();
        return ok();
    }
}
