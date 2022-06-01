package pl.izakostrzewska.openjobs.requirement;

import lombok.Data;
import pl.izakostrzewska.openjobs.Technology;
import pl.izakostrzewska.openjobs.offer.Offer;

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
