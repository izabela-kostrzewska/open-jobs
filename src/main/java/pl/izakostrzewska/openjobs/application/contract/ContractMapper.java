package pl.izakostrzewska.openjobs.application.contract;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractMapper {
    
    ContractDTO mapToContractDTO(Contract contract);
}
