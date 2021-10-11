package ma.cigma.pfe.module1.models;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@Entity
@Table(name = "ClientsMorals")
@Data @ToString @AllArgsConstructor @NoArgsConstructor
//@PrimaryKeyJoinColumn(name = "client_id")
//@DiscriminatorValue(value = "moral")
public class ClientMoral extends Client{

    private String rc;
    private String patente;

}
