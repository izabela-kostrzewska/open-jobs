package pl.izakostrzewska.openjobs.company;

import lombok.Data;
import pl.izakostrzewska.openjobs.offer.Offer;
import pl.izakostrzewska.openjobs.user.User;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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