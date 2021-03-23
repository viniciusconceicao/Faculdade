package com.example.projetojpa2.controle;

import com.example.projetojpa2.dominio.Serie;
import com.example.projetojpa2.repositorio.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieRepository repository;

    @GetMapping
    public ResponseEntity getSeries(){
        List<Serie> series = repository.findAll();

        if (series.isEmpty()){
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(200).body(series);
        }
    }

    @PostMapping
    public ResponseEntity postSerie(@RequestBody Serie novaSerie){
        repository.save(novaSerie);
        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteSerie(@PathVariable Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

}
