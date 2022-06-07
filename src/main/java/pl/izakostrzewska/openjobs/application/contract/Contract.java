package pl.izakostrzewska.openjobs.application.contract;

import lombok.Data;

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
