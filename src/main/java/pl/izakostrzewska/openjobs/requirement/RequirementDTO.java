package pl.izakostrzewska.openjobs.requirement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequirementDTO {

    private Long id;
    private String technology;
    private int level;
}