package ma.cigma.pfe.module1.dto;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_SpringBoot
 */

@Entity
@Table(name = "Factures")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class FactureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private double montant;
    private String description;
}
