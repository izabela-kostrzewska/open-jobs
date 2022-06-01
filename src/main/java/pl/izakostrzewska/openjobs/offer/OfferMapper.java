package pl.izakostrzewska.openjobs.offer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.contract.ContractMapper;
import pl.izakostrzewska.openjobs.requirement.RequirementMapper;

@Mapper(componentModel = "spring",
        uses = {
                ContractMapper.class,
                RequirementMapper.class
        })
public interface OfferMapper {

        @Mapping(target = "company", source = "company.name")
        OfferDTO mapToOfferDTO(Offer offer);
}
