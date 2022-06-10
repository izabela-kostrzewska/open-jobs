package pl.izakostrzewska.openjobs.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String reference;
    private String name;
    private String address;
    private String description;
    private String logoImage;
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;
    @OneToMany(mappedBy = "company")
    private List<Offer> offers;
}
