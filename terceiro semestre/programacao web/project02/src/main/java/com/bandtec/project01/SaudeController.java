package com.bandtec.project01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SaudeController {


    @GetMapping("/frutas-dia/{frutas}")
    public String ingestaoFrutasDia(@PathVariable int frutas){
        String resultado;
        switch (frutas){
            case 0:
            resultado = "De mau a pior";
            break;

            case 1:
                resultado = "Melhor que nada";
                break;

            case 2:
                resultado = "É o mínimo";
                break;

            default:
                resultado = "Ai sim!!!";

        }

        return "Com relação ao seu consumo de frutas por dia: "+resultado;
    }

}
