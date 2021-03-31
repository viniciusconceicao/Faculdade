package com.example.projetojpa3.controller;


import com.example.projetojpa3.domain.Produto;
import com.example.projetojpa3.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

    @RestController
    @RequestMapping("/produtos")
    public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity postProduto(@RequestBody @Valid Produto novoProduto){
        repository.save(novoProduto);
        return ResponseEntity.status(201).build();
    }

}
