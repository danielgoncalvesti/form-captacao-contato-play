package services;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import javax.inject.Inject;
import java.io.File;
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
        email.setSubject("News from Meetup platform");
        email.setFrom("danielgoncalvesti@gmail.com");
        email.addTo("dufabc@gmail.com");
        email.setBodyHtml(MailerService.mailBody());
        email.addAttachment("data.txt", "data\ndata2\ndata3".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE);
        mailerClient.send(email);
    }

    private static String mailBody () {
        return "<html>" +
                "<body><b>Hello kanika,</b><br/>" +
                "Hope you are doing good. We have some news for you from our platform." +
                "There is a meetup scheduled in resturant with title <title>" +
                "<b>Please login to app to approve/reject it</b></body></html>";
    }
}