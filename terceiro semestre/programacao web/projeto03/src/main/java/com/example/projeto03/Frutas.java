package com.example.projeto03;

public class Frutas {

    private String nome;
    private Double preco;
    private Integer quantidade;
    private Boolean comSemente;
    private Integer caloria;

    public Frutas(String nome, Double preco, Integer quantidade, Boolean comSemente, Integer caloria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.comSemente = comSemente;
        this.caloria = caloria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getComSemente() {
        return comSemente;
    }

    public void setComSemente(Boolean comSemente) {
        this.comSemente = comSemente;
    }

    public Integer getCaloria() {
        return caloria;
    }

    public void setCaloria(Integer caloria) {
        this.caloria = caloria;
    }

    @Override
    public String toString() {
        return "\nFrutas" +
                "\nNome: " + nome + '\'' +
                "\nPreço:" + preco +
                "\nQuantidade: " + quantidade +
                "\nCom Semente: " + comSemente +
                "\nCalorias: " + caloria;
    }
}
