package pl.izakostrzewska.openjobs.application.requirement;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RequirementMapper {

    @Mapping(target = "technology", source = "technology.name")
    RequirementDTO mapToRequirementDTO(Requirement requirement);
}
