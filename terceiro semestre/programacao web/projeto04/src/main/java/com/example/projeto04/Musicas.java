package com.example.projeto04;

public class Musicas {

    private String nome;
    private Integer ano;
    private Boolean nacional;

    public Musicas(String nome, Integer ano, Boolean nacional) {
        this.nome = nome;
        this.ano = ano;
        this.nacional = nacional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }
}
