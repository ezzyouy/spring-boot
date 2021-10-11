package ma.cigma.pfe.module1.services;

import ma.cigma.pfe.module1.models.Demand;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
public interface DemandService {
    Demand insertDemand(Demand demand);
    Demand updateDemand(Demand demand);
    void deleteDemand(Integer id);
    Demand selectOneDemand(Integer id);
    List<Demand> selectAllDemands();
}
