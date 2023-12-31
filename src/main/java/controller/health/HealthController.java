package controller.health;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {



    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format("Hello, ", name);
    }

}

