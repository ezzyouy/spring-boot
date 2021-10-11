package ma.cigma.pfe.module1.services.impl;

import ma.cigma.pfe.module1.dao.ClientDao;
import ma.cigma.pfe.module1.models.Client;
import ma.cigma.pfe.module1.services.ClientService;
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
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public Client insertClient(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        Client clientOld= clientDao.findById(client.getId()).get();
        clientOld.setCin(client.getCin());
        clientOld.setNom(client.getNom());
        return clientDao.save(clientOld);

    }

    @Override
    public void deleteClient(Integer id) {
        clientDao.deleteById(id);
    }

    @Override
    public Client selectOneClient(Integer id) {
        return clientDao.findById(id).get();
    }

    @Override
    public List<Client> selectAllClients() {
        return (List<Client>) clientDao.findAll();
    }
}
