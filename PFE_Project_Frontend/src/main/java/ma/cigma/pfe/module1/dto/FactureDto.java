package ma.cigma.pfe.module1.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Sofia BOUAGRA
 * @project PFE_SpringBoot
 */
@Getter @Setter @ToString
public class FactureDto {

    private int id;
    private double montant;
    private String description;
}
