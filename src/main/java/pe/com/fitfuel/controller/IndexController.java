package pe.com.fitfuel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/mensaje")
    public String mensaje(){
        return "Bienvenido desde Java a azure";
    }
}
