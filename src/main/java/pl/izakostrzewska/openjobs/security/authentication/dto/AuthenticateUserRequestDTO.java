package pl.izakostrzewska.openjobs.security.authentication.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
@Valid
public class AuthenticateUserRequestDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
