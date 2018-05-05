package services;
import models.Interessado;
import models.InteressadoHelper;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
import java.util.List;

import org.apache.commons.mail.EmailAttachment;

public class MailerService {
    MailerClient mailerClient;

    @Inject
    public MailerService(MailerClient mailerClient) {
        this.mailerClient = mailerClient;
    }

    public void sendEmail() {
        String cid = "1234";
        Email email = new Email();
        email.setSubject("Lista de emails de interessados");
        email.setFrom("danielgoncalvesti@gmail.com");
        email.addTo("danielgoncalvesti@gmail.com");
        email.setBodyHtml(MailerService.mailBody());
        email.addAttachment("interessados.csv", attachmentInteressados().getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE);
        mailerClient.send(email);
    }
    public static String attachmentInteressados(){
        List<Interessado> interessados = models.InteressadoHelper.getInteressadoAll();
        String listAttachment = "";
        for (Interessado i : interessados){
            listAttachment += i.nome+";"+i.conhecimentoJava.id+";"+i.email+"\n";
        }
        return listAttachment;
    }
    private static String mailBody () {
        return "<html>" +
                "<body><b>Hello</b><br/>" +
                "Hope you are doing good. We have some news for you from our platform." +
                "There is a meetup scheduled in resturant with title <title>" +
                "<b>Please login to app to approve/reject it</b></body></html>";
    }
}