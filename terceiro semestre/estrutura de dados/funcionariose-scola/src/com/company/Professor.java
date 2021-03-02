package com.company;

public class Professor extends Funcionario{

    public Professor(String nome, Integer qtdHoras, Double valorHora) {
        super(nome, qtdHoras, valorHora);
    }

    @Override
    public Double getValorBonus() {
      return  getQtdHoras()+getValorHora()*4.5*0.15;
    }

    @Override
    public String toString() {
        return "\n\nProfessor " + super.toString();
    }
}
