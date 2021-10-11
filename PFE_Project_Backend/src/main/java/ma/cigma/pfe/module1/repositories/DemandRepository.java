package ma.cigma.pfe.module1.repositories;

import ma.cigma.pfe.module1.dto.DemandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Repository
public interface DemandRepository extends CrudRepository<DemandEntity,Integer> {


}
