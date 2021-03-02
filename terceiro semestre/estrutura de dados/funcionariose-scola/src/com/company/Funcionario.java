package com.company;


//Devido a regra de negócio, torna o código mais eficiente
// poder codar na página da classe abstrata, pois já que
//o professor e o coordenador possuem duas regras diferentes,
// pode inicia-las por aqui e as demais classes herdam.
public abstract class Funcionario {

    private String nome;
    private Integer qtdHoras;
    private Double valorHora;
    private Double valorBonus;

    public Funcionario(String nome, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
        this.valorBonus = getValorBonus();
    }

    public abstract Double getValorBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return
                "\nNome:'" + nome + '\'' +
                "\nQuantidade de horas: " + qtdHoras +
                "\nValor hora: " + valorHora+
                "\nValor bonus: "+ valorBonus;
    }
}
