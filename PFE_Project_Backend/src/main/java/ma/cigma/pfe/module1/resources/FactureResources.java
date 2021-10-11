package ma.cigma.pfe.module1.resources;

import ma.cigma.pfe.module1.dto.FactureEntity;
import ma.cigma.pfe.module1.services.FactureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Brahim Ezzyouy
 * @project PFE_SpringBoot
 */
@RestController
@RequestMapping("api/factures")
public class FactureResources {

    @Autowired
    private FactureServices factureServices;

    // Consulter ALL
    @GetMapping(path="/all",produces= MediaType.APPLICATION_JSON_VALUE)
    public List<FactureEntity> getAll(){
        return factureServices.selectAllFactures();
    }
    // Consulter One
    @GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public FactureEntity getOne(@PathVariable("id") int id) {
        return factureServices.selectOneFacture(id);
    }
    // Create One
    @PostMapping(path="/create",consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public FactureEntity create(@RequestBody FactureEntity factureEntity) {
        return factureServices.insertFacture(factureEntity);
    }
    // Update One
    @PutMapping(path="/update",consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public FactureEntity update(@RequestBody FactureEntity factureEntity) {
        return factureServices.updateFacture(factureEntity);
    }
    // Delete One
    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable("id") int id) {
        factureServices.deleteFacture(id);
    }
}
