package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.*;
import services.*;
import javax.inject.Inject;

public class MailerController extends Controller {
    MailerService mailerClient;

    @Inject
    public MailerController (MailerService mailer) {
        this.mailerClient = mailer;
    }

    public Result sendMail() {
        mailerClient.sendEmail();
        return ok();
    }
}
