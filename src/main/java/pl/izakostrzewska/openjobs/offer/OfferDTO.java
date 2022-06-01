package pl.izakostrzewska.openjobs.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.izakostrzewska.openjobs.contract.ContractDTO;
import pl.izakostrzewska.openjobs.requirement.RequirementDTO;

import java.util.List;

@Data
@AllArgsConstructor
public class OfferDTO {

    private Long id;
    private String position;
    private String description;
    private String company;
    private List<ContractDTO> contracts;
    private List<RequirementDTO> requirements;
}
