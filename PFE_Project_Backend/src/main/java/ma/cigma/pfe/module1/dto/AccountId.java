package ma.cigma.pfe.module1.dto;

import lombok.*;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Brahim Ezzyouy
 * @project PFE_Project
 */

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Embeddable
public class AccountId implements Serializable {
    private String number;
    private String type;

    @Override
    public int hashCode(){
      return number.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        AccountId compositeId = (AccountId) o;
        return compositeId.getNumber().equals(number);
    }
}
