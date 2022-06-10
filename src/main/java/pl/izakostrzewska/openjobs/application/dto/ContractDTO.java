package pl.izakostrzewska.openjobs.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.izakostrzewska.openjobs.application.model.ContractType;

@Data
@AllArgsConstructor
public class ContractDTO {

    private Long id;
    private ContractType type;
    private int minSalary;
    private int maxSalary;
}
