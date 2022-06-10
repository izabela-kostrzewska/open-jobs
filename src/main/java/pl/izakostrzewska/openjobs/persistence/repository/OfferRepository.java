package pl.izakostrzewska.openjobs.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.izakostrzewska.openjobs.persistence.entity.Offer;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    @Query("SELECT o FROM Offer o JOIN FETCH o.company JOIN FETCH o.contracts JOIN FETCH o.requirements")
    List<Offer> findEverything();
}
