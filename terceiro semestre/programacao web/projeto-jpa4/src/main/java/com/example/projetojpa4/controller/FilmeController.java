package com.example.projetojpa4.controller;

import com.example.projetojpa4.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    //@GetMapping
    public ResponseEntity getPorDiretor(@RequestParam String diretor){

        return ResponseEntity.status(200).body(filmeRepository.findByDiretor(diretor));

    }

    @GetMapping
    public ResponseEntity getPorDiretorClassico(@RequestParam String diretor,
                                                @RequestParam boolean classico){

        return ResponseEntity.status(200).body(filmeRepository.findByDiretorContainsAndClassico(diretor,classico));

    }

    @GetMapping("/classicos")
    public ResponseEntity getClassicos(){
        return ResponseEntity.status(200).body(filmeRepository.findByClassicoTrue());
    }

    @GetMapping("/simples")
    public ResponseEntity getSimples(){
        return ResponseEntity.status(200).body(filmeRepository.findAllSimples();
    }




}
