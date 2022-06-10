package pl.izakostrzewska.openjobs.infrastracture.email.event;

import org.thymeleaf.context.Context;
import pl.izakostrzewska.openjobs.persistence.entity.confirmation;

public class ResetCredentialsMailEvent extends MailEvent {

    public ResetCredentialsMailEvent(confirmation confirmation, String confirmationLink) {
        this.recipient = confirmation.getUser().getEmail();
        this.subject = "Confirm your password reset in OpenJobs";
        this.templateName = "reset-credentials.html";
        this.context = createContext(confirmation, confirmationLink);
    }

    private Context createContext(confirmation confirmation, String confirmationLink) {
        Context context = new Context();
        context.setVariable("user", confirmation.getUser());
        context.setVariable("confirmationLink", confirmationLink);
        return context;
    }
}
