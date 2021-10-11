package ma.cigma.pfe.module1.resources;

import ma.cigma.pfe.module1.models.Client;
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
    public List<Client> selectAllClients() {
        return clientService.selectAllClients();
    }

    @GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Client selectOneClient(@PathVariable("id") int id) {
        return clientService.selectOneClient(id);
    }

    @PostMapping(path="/create",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public Client add( @RequestBody Client client) {
        return clientService.insertClient(client);
    }

    @PutMapping(path="/update",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public Client update( @RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping(path="/{id}")
    public void deleteOne(@PathVariable("id") int id) {
        clientService.deleteClient(id);
    }
}
