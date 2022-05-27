package pl.izakostrzewska.openjobs;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
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
