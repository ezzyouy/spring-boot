package ma.cigma.pfe.module1.dto;

import lombok.*;
import javax.persistence.*;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Entity
@Table(name = "Accounts")
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
//@IdClass(AccountId.class)
public class AccountEntity {

    @EmbeddedId
    private AccountId accountId;
    //@Id
    //private String number;
    //@Id
    //private String type;
    private double montant;
}
