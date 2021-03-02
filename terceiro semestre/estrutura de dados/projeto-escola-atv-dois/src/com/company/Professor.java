package com.company;

public class Professor implements Funcionario{

    private String nome;
    private Integer qtdHora;
    private Double valorHora;

    public Professor(String nome, Integer qtdHora, Double valorHora) {
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorBonus() {
        return qtdHora*valorHora*4.5*0.15;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "\n\nProfessor" +
                "\nNome: " + nome + '\'' +
                "\nQuantidade de aulas: " + qtdHora +
                "\nValor aula: " + valorHora +
                "\nValor bonus: "+ getValorBonus();
    }
}
