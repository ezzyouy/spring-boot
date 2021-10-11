package ma.cigma.pfe.module1.dto;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@Entity
@Table(name="ClientsPhysiques")
@Getter
@Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "client_id")
//@DiscriminatorValue(value = "physique")
public class ClientPhysiqueEntity extends ClientEntity {

    @Column(unique = true)
    private String matricule;
}
