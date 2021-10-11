package ma.cigma.pfe.module1.models;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Details")
@Data @ToString @AllArgsConstructor @NoArgsConstructor
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String adresse;

    @OneToOne
    @MapsId
    private Client client;

}
