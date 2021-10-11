package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.models.Demand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Repository
public interface DemandDao extends CrudRepository<Demand,Integer> {


}
