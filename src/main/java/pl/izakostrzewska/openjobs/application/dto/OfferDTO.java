package pl.izakostrzewska.openjobs.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

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
