package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.model.ConfirmationType;
import pl.izakostrzewska.openjobs.persistence.entity.confirmation;
import pl.izakostrzewska.openjobs.persistence.entity.User;

@Mapper(componentModel = "spring")
public interface ConfirmationMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "token", expression = "java(java.util.UUID.randomUUID())")
    @Mapping(target = "expiresAt", expression = "java(java.time.LocalDateTime.now().plusHours(12))")
    confirmation mapToConfirmation(ConfirmationType type, User user);
}
