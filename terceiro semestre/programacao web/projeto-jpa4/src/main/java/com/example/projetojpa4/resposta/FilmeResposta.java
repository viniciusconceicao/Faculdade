package com.example.projetojpa4.resposta;

import com.example.projetojpa4.domain.Filme;

public class FilmeResposta {

    private String titulo;
    private Integer anoLancamento;

    public FilmeResposta(Filme filme) {
        this.titulo=filme.getTitulo();
        this.anoLancamento = filme.getDataLancamento().getYear();
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }
}
