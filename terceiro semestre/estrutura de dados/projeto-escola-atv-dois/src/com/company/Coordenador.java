package com.company;

public class Coordenador implements Funcionario{

    private String nome;
    private Integer qtdHoraCoordenacao;
    private Double valorHoraCoordenacao;
    private Integer qtdHoraAula;
    private Double valorHoraAula;

    public Coordenador(String nome, Integer qtdHoraCoordenacao,
                       Double valorHoraCoordenacao, Integer qtdHoraAula, Double valorHoraAula) {
        this.nome = nome;
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
        this.qtdHoraAula = qtdHoraAula;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return qtdHoraAula*valorHoraAula*4.5*0.15+qtdHoraCoordenacao*valorHoraCoordenacao*4.5*0.2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoraCoordenacao() {
        return qtdHoraCoordenacao;
    }

    public void setQtdHoraCoordenacao(Integer qtdHoraCoordenacao) {
        this.qtdHoraCoordenacao = qtdHoraCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public Integer getQtdHoraAula() {
        return qtdHoraAula;
    }

    public void setQtdHoraAula(Integer qtdHoraAula) {
        this.qtdHoraAula = qtdHoraAula;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "\n\nCoordenador" +
                "\nNome: " + nome + '\'' +
                "\nQuantidade de horas coordenação: " + qtdHoraCoordenacao +
                "\nValor hora coordenação: " + valorHoraCoordenacao +
                "\nQuantidade de horas aula: " + qtdHoraAula +
                "\nValor da hora aula: " + valorHoraAula +
                "\nValor do bonus: "+ getValorBonus();
    }
}
