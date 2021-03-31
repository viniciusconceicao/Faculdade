package com.example.projetojpa3.repository;

import com.example.projetojpa3.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {



}
