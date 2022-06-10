package pl.izakostrzewska.openjobs.persistence.entity;

import lombok.Data;
import pl.izakostrzewska.openjobs.application.model.ContractType;

import javax.persistence.*;

@Data
@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ContractType type;
    private Integer minSalary;
    private Integer maxSalary;
}
