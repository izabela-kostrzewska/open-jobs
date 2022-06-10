package pl.izakostrzewska.openjobs.security.access;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.izakostrzewska.openjobs.application.dto.PasswordDTO;
import pl.izakostrzewska.openjobs.application.exception.*;
import pl.izakostrzewska.openjobs.application.mapper.ConfirmationMapper;
import pl.izakostrzewska.openjobs.infrastracture.email.event.ResetCredentialsMailEvent;
import pl.izakostrzewska.openjobs.persistence.entity.User;
import pl.izakostrzewska.openjobs.persistence.entity.confirmation;
import pl.izakostrzewska.openjobs.persistence.repository.ConfirmationRepository;
import pl.izakostrzewska.openjobs.persistence.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static pl.izakostrzewska.openjobs.application.model.ConfirmationType.CREDENTIALS_RESET;

@Service
@RequiredArgsConstructor
public class CredentialsResetService {

    private final UserRepository userRepository;
    private final ConfirmationRepository confirmationRepository;
    private final ConfirmationMapper confirmationMapper;
    private final ApplicationEventPublisher publisher;
    private final PasswordEncoder passwordEncoder;

    public void reset(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(UserNotExistsException::new);

        if (user.getEnabled()) {
            throw new UserNotRegisteredException();
        }
        confirmation confirmation = confirmationMapper.mapToConfirmation(CREDENTIALS_RESET, user);
        confirmationRepository.save(confirmation);
        publisher.publishEvent(new ResetCredentialsMailEvent(confirmation, createConfirmationLink(confirmation)));
    }

    private String createConfirmationLink(confirmation confirmation) {
        return linkTo(AccessController.class).toUriComponentsBuilder()
                .path("/reset/confirmation")
                .queryParam("token", confirmation.getToken())
                .build()
                .toUriString();
    }

    public void confirm(UUID token, PasswordDTO passwordDTO) {
        confirmation confirmation = confirmationRepository.findByTypeAndToken(CREDENTIALS_RESET, token)
                .orElseThrow(ConfirmationNotExistsException::new);

        if (confirmation.getExpiresAt().isBefore(LocalDateTime.now())) {
            throw new ConfirmationExpiredException();
        }
        if (confirmation.getUsed()) {
            throw new VerificationAlreadyConfirmedException();
        }
        User user = confirmation.getUser();
        user.setPassword(passwordEncoder.encode(passwordDTO.getPassword()));
    }
}