package ma.cigma.pfe.module1.models;

import lombok.*;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Data @ToString @AllArgsConstructor @NoArgsConstructor
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
