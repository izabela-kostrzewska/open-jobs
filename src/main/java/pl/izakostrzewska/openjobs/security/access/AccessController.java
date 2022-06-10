package pl.izakostrzewska.openjobs.security.access;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.izakostrzewska.openjobs.application.dto.PasswordDTO;
import pl.izakostrzewska.openjobs.application.dto.RegistrationDTO;

import java.util.UUID;

@RestController
@RequestMapping("/access")
@RequiredArgsConstructor
public class AccessController {

    private final RegistrationService registrationService;
    private final CredentialsResetService credentialsResetService;

    @PostMapping("/registration")
    public void registerUser(@RequestBody RegistrationDTO userDTO) {
        registrationService.register(userDTO);
    }

    @RequestMapping(value = "/registration/confirmation", method = {RequestMethod.GET, RequestMethod.POST})
    public void confirmRegistration(@RequestParam UUID token) {
        registrationService.confirm(token);
    }

    @GetMapping("/registration/verification")
    public void resentRegistrationVerification(@RequestParam String email) {
        registrationService.resent(email);
    }

    @PostMapping("/reset")
    public void resetCredentials(@RequestParam String email) {
        credentialsResetService.reset(email);
    }

    @RequestMapping(value = "/reset/confirmation", method = {RequestMethod.GET, RequestMethod.POST})
    public void confirmCredentialsReset(@RequestParam UUID token,
                                        @RequestBody PasswordDTO passwordDTO) {
        credentialsResetService.confirm(token, passwordDTO);
    }
}
