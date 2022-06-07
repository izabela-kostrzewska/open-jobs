package pl.izakostrzewska.openjobs.application.requirement;

import lombok.Data;
import pl.izakostrzewska.openjobs.application.technology.Technology;
import pl.izakostrzewska.openjobs.application.offer.Offer;

import javax.persistence.*;

@Data
@Entity
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;
    private Integer level;
}
