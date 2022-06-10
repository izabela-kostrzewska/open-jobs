package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import pl.izakostrzewska.openjobs.application.dto.ContractDTO;
import pl.izakostrzewska.openjobs.persistence.entity.Contract;

@Mapper(componentModel = "spring")
public interface ContractMapper {
    
    ContractDTO mapToContractDTO(Contract contract);
}
