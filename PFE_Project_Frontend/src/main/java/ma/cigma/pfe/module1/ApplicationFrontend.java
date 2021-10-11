package ma.cigma.pfe.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sofia BOUAGRA
 * @project PFE_SpringBoot
 */

@SpringBootApplication
@ComponentScan(basePackages = {"ma.cigma.pfe.module1.controllers","ma.cigma.pfe.module1.dto","ma.cigma.pfe.module1.security"})
public class ApplicationFrontend {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationFrontend.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
