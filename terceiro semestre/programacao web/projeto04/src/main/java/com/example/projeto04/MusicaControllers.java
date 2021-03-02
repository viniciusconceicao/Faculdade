package com.example.projeto04;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/musicas")
public class MusicaControllers {

    private List<Musicas> listaMusica = new ArrayList<>();

    public MusicaControllers(List<Musicas> listaMusica) {
        this.listaMusica.add(new Musicas("Lá vou eu", 1997, true));
        this.listaMusica.add(new Musicas("Amendo bobo", 2004, false));
        this.listaMusica.add(new Musicas("Chalé no Alaska", 2018, true));
    }

    @GetMapping
    public List<Musicas> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<Musicas> listaMusica) {
        this.listaMusica = listaMusica;
    }


    @GetMapping("/{posicao}")
    public Musicas getMusica(@PathVariable Integer posicao){
        if (posicao < listaMusica.size()){
            return listaMusica.get(posicao);
        } else {
            return null;
        }
    }

    @DeleteMapping ("/{posicao}")
    public String getMusica(@PathVariable int posicao){
        if (posicao < listaMusica.size()){
            return "Deletada com sucesso";
        } else {
            return null;
        }
    }
}
