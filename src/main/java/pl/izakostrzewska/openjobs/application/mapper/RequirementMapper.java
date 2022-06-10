package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.dto.RequirementDTO;
import pl.izakostrzewska.openjobs.persistence.entity.Requirement;

@Mapper(componentModel = "spring")
public interface RequirementMapper {

    @Mapping(target = "technology", source = "technology.name")
    RequirementDTO mapToRequirementDTO(Requirement requirement);
}
