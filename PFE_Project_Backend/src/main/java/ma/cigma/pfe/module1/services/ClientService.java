package ma.cigma.pfe.module1.services;

import ma.cigma.pfe.module1.dto.ClientEntity;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
public interface ClientService {
    ClientEntity insertClient(ClientEntity clientEntity);
    ClientEntity updateClient(ClientEntity clientEntity);
    void deleteClient(Integer id);
    ClientEntity selectOneClient(Integer id);
    List<ClientEntity> selectAllClients();
}
