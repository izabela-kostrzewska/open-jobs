package pl.izakostrzewska.openjobs.security.access;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.izakostrzewska.openjobs.application.dto.CompanyDTO;
import pl.izakostrzewska.openjobs.application.dto.RegistrationDTO;
import pl.izakostrzewska.openjobs.application.dto.UserDTO;
import pl.izakostrzewska.openjobs.application.exception.*;
import pl.izakostrzewska.openjobs.application.mapper.CompanyMapper;
import pl.izakostrzewska.openjobs.application.mapper.ConfirmationMapper;
import pl.izakostrzewska.openjobs.application.mapper.UserMapper;
import pl.izakostrzewska.openjobs.infrastracture.email.event.ConfirmRegistrationMailEvent;
import pl.izakostrzewska.openjobs.persistence.entity.Company;
import pl.izakostrzewska.openjobs.persistence.entity.User;
import pl.izakostrzewska.openjobs.persistence.entity.confirmation;
import pl.izakostrzewska.openjobs.persistence.repository.CompanyRepository;
import pl.izakostrzewska.openjobs.persistence.repository.ConfirmationRepository;
import pl.izakostrzewska.openjobs.persistence.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static pl.izakostrzewska.openjobs.application.model.ConfirmationType.REGISTRATION;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;
    private final ConfirmationRepository confirmationRepository;
    private final ConfirmationMapper confirmationMapper;
    private final ApplicationEventPublisher publisher;

    @Transactional
    public void register(RegistrationDTO registrationDTO) {
        UserDTO userDTO = registrationDTO.getUser();
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new UserAlreadyRegisteredException();
        }
        User user = userMapper.mapToUser(userDTO);
        userRepository.save(user);

        CompanyDTO companyDTO = registrationDTO.getCompany();
        if (companyRepository.existsByReference(companyDTO.getReference())) {
            throw new CompanyAlreadyExistsException();
        }
        Company company = companyMapper.mapToCompany(companyDTO, user);
        companyRepository.save(company);

        confirmation confirmation = confirmationMapper.mapToConfirmation(REGISTRATION, user);
        confirmationRepository.save(confirmation);
        publisher.publishEvent(new ConfirmRegistrationMailEvent(confirmation, createConfirmationLink(confirmation)));
    }

    @Transactional
    public void confirm(UUID token) {
        confirmation confirmation = confirmationRepository.findByTypeAndToken(REGISTRATION, token)
                .orElseThrow(ConfirmationNotExistsException::new);

        if (confirmation.getExpiresAt().isBefore(LocalDateTime.now())) {
            throw new ConfirmationExpiredException();
        }
        if (confirmation.getUsed()) {
            throw new VerificationAlreadyConfirmedException();
        }
        User user = confirmation.getUser();
        user.setEnabled(true);
    }

    public void resent(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(UserNotExistsException::new);

        if (user.getEnabled()) {
            throw new UserAlreadyRegisteredException();
        }
        confirmation confirmation = confirmationMapper.mapToConfirmation(REGISTRATION, user);
        confirmationRepository.save(confirmation);
        publisher.publishEvent(new ConfirmRegistrationMailEvent(confirmation, createConfirmationLink(confirmation)));
    }

    private String createConfirmationLink(confirmation confirmation) {
        return linkTo(AccessController.class).toUriComponentsBuilder()
                .path("/registration/confirmation")
                .queryParam("token", confirmation.getToken())
                .build()
                .toUriString();
    }
}