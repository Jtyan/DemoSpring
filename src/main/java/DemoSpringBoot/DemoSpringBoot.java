package DemoSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoSpringBoot {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
