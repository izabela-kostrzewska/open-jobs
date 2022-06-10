package pl.izakostrzewska.openjobs.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.izakostrzewska.openjobs.persistence.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByReference(String reference);
}
