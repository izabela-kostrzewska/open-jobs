package pl.izakostrzewska.openjobs.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
