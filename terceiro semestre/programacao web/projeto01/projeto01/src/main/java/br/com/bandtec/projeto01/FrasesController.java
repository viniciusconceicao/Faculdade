package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FrasesController {

    @GetMapping
    public String padrao(){
        return "sdds férias!!";
    }

    @GetMapping("/bom-dia")
    public String bomDia(){
        return "Bom dia, galera!!";
    }

    @GetMapping("/boa-tarde")
    public String boaTarde(){
        return "Boa tarde, preguiça da tarde!!";
    }
}
