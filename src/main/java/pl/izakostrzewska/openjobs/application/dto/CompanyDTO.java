package pl.izakostrzewska.openjobs.application.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyDTO {

    private Long id;
    private String reference;
    private String name;
    private String address;
    private String description;
    private String logoImage;
}
