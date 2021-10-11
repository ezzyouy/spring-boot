package ma.cigma.pfe.module1.services;

import ma.cigma.pfe.module1.dto.FactureEntity;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_SpringBoot
 */
public interface FactureServices {
    FactureEntity insertFacture(FactureEntity factureEntity);
    FactureEntity updateFacture(FactureEntity factureEntity);
    void deleteFacture(Integer id);
    FactureEntity selectOneFacture(Integer id);
    List<FactureEntity> selectAllFactures();
}
