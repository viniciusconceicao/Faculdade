package com.company;

public class Coordenador extends Funcionario {

    public Coordenador(String nome, Integer qtdHoras, Double valorHora) {
        super(nome, qtdHoras, valorHora);
    }

    @Override
    public Double getValorBonus() {
        return getQtdHoras()+getValorHora()*4.5*0.2;
    }

    @Override
    public String toString() {
        return "\n\nCoordenador " + super.toString();
    }
}
