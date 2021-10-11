package ma.cigma.pfe.module1.models;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Clients")
@Data @ToString @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Column(unique = true)
    private String cin;
    private String nom;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private Set<Demand> demands;
    @OneToOne(cascade=CascadeType.PERSIST,mappedBy="client")
    private Detail detail;

}
