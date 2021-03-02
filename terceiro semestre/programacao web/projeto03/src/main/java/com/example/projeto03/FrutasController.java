package com.example.projeto03;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/frutas")
public class FrutasController {

    private Frutas f1 = new Frutas("Abacaxi", 5.00, 3, true,100);
    Scanner input = new Scanner(System.in);


    private List<Frutas> listaFrutas = new ArrayList<>();


    public FrutasController() {
        listaFrutas.add(new Frutas("morango", 5.00, 2, false,50));
        listaFrutas.add(new Frutas("Mamão", 3.00, 4, true,200));
        listaFrutas.add(new Frutas("Ameixa", 15.00, 7, true,150));
    }

    @GetMapping("/minha-fruta")
    public Frutas minhaFruta(){
        return f1;
    }

    @GetMapping("/listar")
    public List<Frutas> listar(){
        return listaFrutas;
    }

    @GetMapping("/cadastrar")
    public Frutas cadastrar(){

        String nome;
        Double preco;
        Integer quantidade;
        Boolean comSemente;
        Integer caloria;

        do {
            System.out.println("Informe o nome: ");
            nome = input.next();
            System.out.println("Informe o preço: ");
            preco = input.nextDouble();
            System.out.println("Informe a quantidade: ");
            quantidade = input.nextInt();
            System.out.println("Possui semente? ");
            comSemente = input.hasNextBoolean();
            System.out.println("Informe a quantidade de calorias: ");
            caloria = input.nextInt();
        }while (input.equals("parar"));


        Frutas f2 = new Frutas(nome, preco, quantidade, comSemente, caloria);

        return f2;
    }


}
