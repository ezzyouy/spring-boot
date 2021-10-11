package ma.cigma.pfe.module1.services;

import ma.cigma.pfe.module1.models.Client;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
public interface ClientService {
    Client insertClient(Client client);
    Client updateClient(Client client);
    void deleteClient(Integer id);
    Client selectOneClient(Integer id);
    List<Client> selectAllClients();
}
