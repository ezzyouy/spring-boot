package ma.cigma.pfe.module1.models;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Demands")
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String compte;
    @Transient
    private int nb;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.REMOVE,CascadeType.MERGE})
    @JoinColumn(name = "client_fk")
    private Client client;

}
