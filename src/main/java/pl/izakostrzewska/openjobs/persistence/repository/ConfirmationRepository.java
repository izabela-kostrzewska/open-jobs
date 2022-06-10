package pl.izakostrzewska.openjobs.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.izakostrzewska.openjobs.application.model.ConfirmationType;
import pl.izakostrzewska.openjobs.persistence.entity.confirmation;

import java.util.Optional;
import java.util.UUID;

public interface ConfirmationRepository extends JpaRepository<confirmation, Long> {

    @Query("SELECT c FROM confirmation c JOIN FETCH c.user WHERE c.type = :type AND c.token = :token")
    Optional<confirmation> findByTypeAndToken(ConfirmationType type, UUID token);
}
