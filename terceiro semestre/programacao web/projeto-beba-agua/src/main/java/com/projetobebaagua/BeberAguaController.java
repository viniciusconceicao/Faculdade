package com.projetobebaagua;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BeberAguaController {

    private Double litros;
    private Integer contador = 0;
    private Double totalLitros = 0.0;

    @GetMapping("/beber-agua/{litros}")
    public Double qtdAgua(@PathVariable Double litros){


    if (litros >= 0.0){
    totalLitros +=litros;
    contador++;
    }

    return totalLitros;

    }


    @GetMapping("/beber-agua/consultar")
    public String consultarQtdAgua(){
        return "Você já bebeu água "+contador+" vezes, totalizando "+totalLitros+" litros";
    }



}
