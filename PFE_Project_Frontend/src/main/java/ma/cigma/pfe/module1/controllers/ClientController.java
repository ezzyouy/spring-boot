package ma.cigma.pfe.module1.controllers;

import ma.cigma.pfe.module1.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${rest.url}")
    private String apiUrl;

    @RequestMapping("/home")
    public String home(Model m, @ModelAttribute("clientKey") ClientDto clt) {
        List<ClientDto> listClient = restTemplate.getForObject(apiUrl + "/clients/all", List.class);
        m.addAttribute("listClient", listClient);
        ClientDto dto = clt == null ? new ClientDto() : clt;
        m.addAttribute("clientKey", dto);
        System.out.println("list : " +listClient);

        return "indexClient";
    }

    @RequestMapping(path="/crud", params="add")
    public String insert(@ModelAttribute("clientKey") ClientDto dto, RedirectAttributes ra) {
        ClientDto clt = restTemplate.postForObject(apiUrl + "/clients/create", dto, ClientDto.class);
        ra.addFlashAttribute("clientKey", clt);
        return "redirect:/clients/home";
    }

    @RequestMapping(path="/crud",params="update")
    public String update(@ModelAttribute("clientKey") ClientDto dto, RedirectAttributes ra) {
        restTemplate.put(apiUrl + "/clients/update", dto, ClientDto.class);
        ra.addFlashAttribute("clientKey", dto);
        return "redirect:/clients/home";
    }

    @RequestMapping(path="/update/{id}")
    public String edit(@PathVariable("id") int id, RedirectAttributes ra) {
        ClientDto dto = restTemplate.getForObject(apiUrl + "/clients/"+id, ClientDto.class);
        ra.addFlashAttribute("clientKey", dto);
        return "redirect:/clients/home";
    }

    @RequestMapping(path="/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        restTemplate.delete(apiUrl + "/clients/"+id);
        return "redirect:/clients/home";
    }

    @RequestMapping(path="{id}")
    public String selectOneClient(@PathVariable("id") int id, RedirectAttributes ra) {
        ClientDto dto = restTemplate.getForObject(apiUrl + "/clients/"+id, ClientDto.class);
        ra.addFlashAttribute("key", dto);
        return "viewClient";
    }

}
