package pl.izakostrzewska.openjobs.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.izakostrzewska.openjobs.application.dto.CompanyDTO;
import pl.izakostrzewska.openjobs.persistence.entity.Company;
import pl.izakostrzewska.openjobs.persistence.entity.User;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "offers", ignore = true)
    Company mapToCompany(CompanyDTO companyDTO, User user);

    CompanyDTO mapToCompanyDTO(Company company);
}
