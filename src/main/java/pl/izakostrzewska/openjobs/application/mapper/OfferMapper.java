package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.dto.OfferDTO;
import pl.izakostrzewska.openjobs.persistence.entity.Offer;

@Mapper(componentModel = "spring",
        uses = {
                ContractMapper.class,
                RequirementMapper.class
        })
public interface OfferMapper {

        @Mapping(target = "company", source = "company.name")
        OfferDTO mapToOfferDTO(Offer offer);
}
