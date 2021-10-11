package ma.cigma.pfe.module1.services.impl;

import ma.cigma.pfe.module1.repositories.ClientRepository;
import ma.cigma.pfe.module1.dto.ClientEntity;
import ma.cigma.pfe.module1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Brahim Ezzyouy
 * @project PFE_Project
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientEntity insertClient(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity updateClient(ClientEntity clientEntity) {
        ClientEntity clientEntityOld = clientRepository.findById(clientEntity.getId()).get();
        clientEntityOld.setCin(clientEntity.getCin());
        clientEntityOld.setNom(clientEntity.getNom());
        return clientRepository.save(clientEntityOld);

    }

    @Override
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public ClientEntity selectOneClient(Integer id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<ClientEntity> selectAllClients() {
        return (List<ClientEntity>) clientRepository.findAll();
    }
}
