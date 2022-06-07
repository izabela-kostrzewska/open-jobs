package pl.izakostrzewska.openjobs.application.offer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.contract.ContractMapper;
import pl.izakostrzewska.openjobs.application.requirement.RequirementMapper;

@Mapper(componentModel = "spring",
        uses = {
                ContractMapper.class,
                RequirementMapper.class
        })
public interface OfferMapper {

        @Mapping(target = "company", source = "company.name")
        OfferDTO mapToOfferDTO(Offer offer);
}
