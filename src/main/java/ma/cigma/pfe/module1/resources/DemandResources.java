package ma.cigma.pfe.module1.resources;

import ma.cigma.pfe.module1.models.Demand;
import ma.cigma.pfe.module1.services.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@RestController
@RequestMapping(path = "/api/demands")
public class DemandResources {
    @Autowired
    private DemandService demandService;

    @GetMapping(path="/all",produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Demand> selectAllDemands() {
        return demandService.selectAllDemands();
    }
    @GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
    public Demand selectOneDemand(@PathVariable("id") int id) {
        return demandService.selectOneDemand(id);
    }
    @PostMapping(path="/create",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public Demand add( @RequestBody Demand demand) {
        return demandService.insertDemand(demand);
    }
    @PutMapping(path="/update",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public Demand update( @RequestBody Demand demand) {
        return demandService.updateDemand(demand);
    }
    @DeleteMapping(path="/{id}")
    public void deleteOne(@PathVariable("id") int id) {
        demandService.deleteDemand(id);
    }

}
