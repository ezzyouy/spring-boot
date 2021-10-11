package ma.cigma.pfe.module1.services;

import ma.cigma.pfe.module1.dto.DemandEntity;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
public interface DemandService {
    DemandEntity insertDemand(DemandEntity demand);
    DemandEntity updateDemand(DemandEntity demand);
    void deleteDemand(Integer id);
    DemandEntity selectOneDemand(Integer id);
    List<DemandEntity> selectAllDemands();
}
