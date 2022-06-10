package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.dto.RegistrationDTO;
import pl.izakostrzewska.openjobs.application.dto.UserDTO;
import pl.izakostrzewska.openjobs.persistence.entity.Company;
import pl.izakostrzewska.openjobs.persistence.entity.User;

@Mapper(componentModel = "spring", uses = CompanyMapper.class)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", expression = "java(pl.izakostrzewska.openjobs.application.model.UserRole.BUSINESS_USER)")
    @Mapping(target = "enabled", constant = "false")
    User mapToUser(UserDTO userDTO);

    UserDTO mapToUserDTO(User user);

    RegistrationDTO mapToBusinessUserDTO(User user, Company company);
}
