package pl.izakostrzewska.openjobs.application.offer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.izakostrzewska.openjobs.application.company.Company;
import pl.izakostrzewska.openjobs.application.contract.Contract;
import pl.izakostrzewska.openjobs.application.requirement.Requirement;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = {"contracts", "requirements"})
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;
    private String description;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany
    @JoinColumn(name = "id")
    private List<Contract> contracts;
    @OneToMany(mappedBy = "offer")
    private Set<Requirement> requirements;

}
