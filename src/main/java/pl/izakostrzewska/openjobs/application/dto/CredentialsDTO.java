package pl.izakostrzewska.openjobs.application.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
@Valid
public class CredentialsDTO {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
