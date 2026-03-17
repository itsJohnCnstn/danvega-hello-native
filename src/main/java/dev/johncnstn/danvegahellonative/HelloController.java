package dev.johncnstn.danvegahellonative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    String home() {
        return "Hello, Native!";
    }

}
