package ma.cigma.pfe.module1.services.impl;

import ma.cigma.pfe.module1.dao.DemandDao;
import ma.cigma.pfe.module1.models.Demand;
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
    private DemandDao demandDao;

    @Override
    public Demand insertDemand(Demand demand) {
        return demandDao.save(demand);
    }

    @Override
    public Demand updateDemand(Demand demand) {
        Demand demandOld= demandDao.findById(demand.getId()).get();
        demandOld.setCompte(demand.getCompte());
        demandOld.setNb(demand.getId());
        return demandDao.save(demandOld);
    }

    @Override
    public void deleteDemand(Integer id) {
        demandDao.deleteById(id);
    }

    @Override
    public Demand selectOneDemand(Integer id) {
        return demandDao.findById(id).get();
    }

    @Override
    public List<Demand> selectAllDemands() {
        return (List<Demand>) demandDao.findAll();
    }
}
