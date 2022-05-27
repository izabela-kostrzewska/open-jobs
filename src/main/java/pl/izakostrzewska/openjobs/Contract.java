package pl.izakostrzewska.openjobs;

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
    private int minSalary;
    private int maxSalary;
}
