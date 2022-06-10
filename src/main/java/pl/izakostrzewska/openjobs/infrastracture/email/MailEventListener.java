package pl.izakostrzewska.openjobs.infrastracture.email;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import pl.izakostrzewska.openjobs.infrastracture.email.event.MailEvent;

@Component
@RequiredArgsConstructor
public class MailEventListener implements ApplicationListener<MailEvent> {

    private final JavaMailSender mailSender;
    private final TemplateEngine templateEngine;

    @Override
    public void onApplicationEvent(MailEvent event) {
        MimeMessagePreparator messagePreparator = createMessagePreparator(event);
        mailSender.send(messagePreparator);
    }

    private MimeMessagePreparator createMessagePreparator(MailEvent event) {
        return mimeMessage -> {
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setTo(event.getRecipient());
            message.setCc(event.getSecondaryRecipients());
            message.setSubject(event.getSubject());
            message.setText(templateEngine.process(event.getTemplateName(), event.getContext()), true);
        };
    }
}
