package ma.cigma.pfe.module1.controllers;

import ma.cigma.pfe.module1.dto.DemandDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author Sofia BOUAGRA
 * @project PFE_Project
 */
@RequestMapping("/demands")
@Controller
public class DemandController {
    private final RestTemplate restTemplate = new RestTemplate();
    private String urlApi="http://localhost:8080/backboot/api/";

    @RequestMapping("/home")
    public String home(Model m, @ModelAttribute("demandKey") DemandDto dmnd) {
        List<DemandDto> listDemand = restTemplate.getForObject(urlApi + "/demands/all", List.class);
        m.addAttribute("listDemand", listDemand);
        DemandDto dto = dmnd == null ? new DemandDto() : dmnd;
        m.addAttribute("demandKey", dto);
        return "indexDemand";
    }

    @RequestMapping(path="/crud", params="add")
    public String insert(@ModelAttribute("demandKey") DemandDto dto, RedirectAttributes ra) {
        DemandDto dmnd = restTemplate.postForObject(urlApi + "/demands/create", dto, DemandDto.class);
        ra.addFlashAttribute("demandKey", dmnd);
        return "redirect:/demands/home";
    }

    @RequestMapping(path="/crud",params="update")
    public String update(@ModelAttribute("demandKey") DemandDto dto, RedirectAttributes ra) {
        restTemplate.put(urlApi + "/demands/update", dto, DemandDto.class);
        ra.addFlashAttribute("demandKey", dto);
        return "redirect:/demands/home";
    }

    @RequestMapping(path="/update/{id}")
    public String edit(@PathVariable("id") int id, RedirectAttributes ra) {
        DemandDto dto = restTemplate.getForObject(urlApi + "/demands/"+id, DemandDto.class);
        ra.addFlashAttribute("demandKey", dto);
        return "redirect:/demands/home";
    }

    @RequestMapping(path="/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        restTemplate.delete(urlApi + "/demands/"+id);
        return "redirect:/demands/home";
    }



}
