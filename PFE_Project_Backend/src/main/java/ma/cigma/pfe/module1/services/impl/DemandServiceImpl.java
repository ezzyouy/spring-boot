package ma.cigma.pfe.module1.services.impl;

import ma.cigma.pfe.module1.repositories.DemandRepository;
import ma.cigma.pfe.module1.dto.DemandEntity;
import ma.cigma.pfe.module1.services.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@Service
@Transactional
public class DemandServiceImpl implements DemandService {

    @Autowired
    private DemandRepository demandRepository;

    @Override
    public DemandEntity insertDemand(DemandEntity demand) {
        return demandRepository.save(demand);
    }

    @Override
    public DemandEntity updateDemand(DemandEntity demand) {
        DemandEntity demandOld= demandRepository.findById(demand.getId()).get();
        demandOld.setCompte(demand.getCompte());
        demandOld.setNb(demand.getNb());
        return demandRepository.save(demandOld);
    }

    @Override
    public void deleteDemand(Integer id) {
        demandRepository.deleteById(id);
    }

    @Override
    public DemandEntity selectOneDemand(Integer id) {
        return demandRepository.findById(id).get();
    }

    @Override
    public List<DemandEntity> selectAllDemands() {
        return (List<DemandEntity>) demandRepository.findAll();
    }
}
