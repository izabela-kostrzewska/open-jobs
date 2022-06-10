package pl.izakostrzewska.openjobs.persistence.entity;

import lombok.Data;
import org.hibernate.annotations.Type;
import pl.izakostrzewska.openjobs.application.model.ConfirmationType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class confirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ConfirmationType type;
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(nullable = false, unique = true)
    private UUID token;
    @Column(nullable = false)
    private LocalDateTime expiresAt;
    @Column(nullable = false)
    private Boolean used;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
