package ma.cigma.pfe.module1.models;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Accounts")
@Data @ToString @AllArgsConstructor @NoArgsConstructor
//@IdClass(AccountId.class)
public class Account {

    @EmbeddedId
    private AccountId accountId;
    //@Id
    //private String number;
    //@Id
    //private String type;
    private double montant;
}
