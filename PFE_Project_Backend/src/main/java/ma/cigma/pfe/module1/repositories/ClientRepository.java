package ma.cigma.pfe.module1.repositories;

import ma.cigma.pfe.module1.dto.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,Integer> {


}
