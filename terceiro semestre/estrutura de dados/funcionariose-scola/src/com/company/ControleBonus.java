package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private List<Funcionario> listaFuncionarios;

    public ControleBonus() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f){
        listaFuncionarios.add(f);
        System.out.println("Funcionário adicionado!");
    }

    public List exibeLista(){

        System.out.println("\n\nLista de Funcionários");
        return listaFuncionarios;
    }

    public Double calculaSalario(){
        Double valorTotal = 0d;
        for (Funcionario f : listaFuncionarios){
            valorTotal += f.getValorBonus();
        }
        return valorTotal;
    }

}
