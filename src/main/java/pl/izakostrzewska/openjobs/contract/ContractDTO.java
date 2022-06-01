package pl.izakostrzewska.openjobs.contract;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContractDTO {

    private Long id;
    private ContractType type;
    private int minSalary;
    private int maxSalary;
}
