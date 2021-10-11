package ma.cigma.pfe.module1.resources;

import ma.cigma.pfe.module1.dto.ClientEntity;
import ma.cigma.pfe.module1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@RestController
@RequestMapping(path = "/api/clients")
public class ClientResources {

    @Autowired
    private ClientService clientService;

    @GetMapping(path="/all",produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ClientEntity> selectAllClients() {
        return clientService.selectAllClients();
    }

    @GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public ClientEntity selectOneClient(@PathVariable("id") int id) {
        return clientService.selectOneClient(id);
    }

    @PostMapping(path="/create",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public ClientEntity add(@RequestBody ClientEntity clientEntity) {
        return clientService.insertClient(clientEntity);
    }

    @PutMapping(path="/update",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public ClientEntity update(@RequestBody ClientEntity clientEntity) {
        return clientService.updateClient(clientEntity);
    }

    @DeleteMapping(path="/{id}")
    public void deleteOne(@PathVariable("id") int id) {
        clientService.deleteClient(id);
    }
}
