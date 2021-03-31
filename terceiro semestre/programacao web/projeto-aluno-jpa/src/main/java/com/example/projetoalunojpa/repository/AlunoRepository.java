package com.example.projetoalunojpa.repository;

import com.example.projetoalunojpa.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
