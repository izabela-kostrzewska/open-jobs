package pl.izakostrzewska.openjobs.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistrationDTO {

    private UserDTO user;
    private CompanyDTO company;
}
