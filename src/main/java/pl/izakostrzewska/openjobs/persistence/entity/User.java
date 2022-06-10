package pl.izakostrzewska.openjobs.persistence.entity;

import lombok.Data;
import pl.izakostrzewska.openjobs.application.model.UserRole;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, length = 30)
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Column(nullable = false)
    private Boolean enabled;
}
