package ma.cigma.pfe.module1.dto;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Details")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class DetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String adresse;

    @OneToOne
    @MapsId
    private ClientEntity client;

}
