package ma.cigma.pfe.module1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@Entity
@Table(name="ClientsPhysiques")
@Data @ToString @AllArgsConstructor @NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "client_id")
//@DiscriminatorValue(value = "physique")
public class ClientPhysique extends Client{

    @Column(unique = true)
    private String matricule;
}
