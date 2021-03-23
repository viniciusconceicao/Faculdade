package com.example.projetojpa2.repositorio;

import com.example.projetojpa2.dominio.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Integer> {
}
