package pl.izakostrzewska.openjobs.security.authentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import pl.izakostrzewska.openjobs.security.authentication.dto.AuthenticateUserRequestDTO;

public class AuthenticationToken extends UsernamePasswordAuthenticationToken {

    public AuthenticationToken(UserDetails userDetails) {
        super(userDetails.getUsername(), null, userDetails.getAuthorities());
    }

    public AuthenticationToken(AuthenticateUserRequestDTO requestDTO) {
        super(requestDTO.getUsername(), requestDTO.getPassword());
    }
}
