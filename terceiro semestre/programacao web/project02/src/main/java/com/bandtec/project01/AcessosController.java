package com.bandtec.project01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcessosController {

    private int acessos;

    @GetMapping("/contar")
    public String contar(){
        acessos++;
        return "Você já fez "+acessos+" acessos na API";
    }

}
