package ma.cigma.pfe.module1.dto;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Demands")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class DemandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String compte;
    @Transient
    private int nb;
   // @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_fk")
    private ClientEntity client;

}
