package ma.cigma.pfe.module1.repositories;

import ma.cigma.pfe.module1.dto.FactureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Brahim Ezzyouy
 * @project PFE_SpringBoot
 */

@Repository
public interface FactureRepository extends CrudRepository<FactureEntity,Integer> {
}
