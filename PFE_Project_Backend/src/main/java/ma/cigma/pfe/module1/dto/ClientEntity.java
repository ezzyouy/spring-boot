package ma.cigma.pfe.module1.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.Set;

/**
 * @author Brahim Ezzyouy
 * @project PFE_Project
 */

@Entity
@Table(name = "Clients")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Column(unique = true)
    private String cin;
    private String nom;
    @JsonIgnore
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY,value = "")
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "client")
    private Set<DemandEntity> demands;
    @JsonIgnore
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY,value = "")
    @OneToOne(cascade=CascadeType.PERSIST,mappedBy="client")
    private DetailEntity detail;

}
