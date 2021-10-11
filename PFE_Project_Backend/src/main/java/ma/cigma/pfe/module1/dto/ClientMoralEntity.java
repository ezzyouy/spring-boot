package ma.cigma.pfe.module1.dto;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@Entity
@Table(name = "ClientsMorals")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "client_id")
//@DiscriminatorValue(value = "moral")
public class ClientMoralEntity extends ClientEntity {

    private String rc;
    private String patente;

}
