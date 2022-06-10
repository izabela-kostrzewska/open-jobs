package pl.izakostrzewska.openjobs.infrastracture.email.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.thymeleaf.context.Context;

@Getter
public abstract class MailEvent extends ApplicationEvent {

    protected String recipient;
    protected String[] secondaryRecipients;
    protected String subject;
    protected String templateName;
    protected Context context;

    public MailEvent() {
        super(new Object());
    }
}
