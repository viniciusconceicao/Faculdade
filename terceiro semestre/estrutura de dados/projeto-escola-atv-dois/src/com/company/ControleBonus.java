package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {



    private List<Professor> listaProfessores;
    private List<Coordenador> listaCoordenadores;
    private Double totalProfessor;
    private Double totalCoodenador;
    private Double total;

    public ControleBonus() {
        this.listaProfessores = new ArrayList<>();
        this.listaCoordenadores = new ArrayList<>();
    }

    public void addProfessor(Professor p){
        listaProfessores.add(p);
        System.out.println("Funcionário adicionado");

    }

    public List exibirListaProfessor(){
        return listaProfessores;
    }

    public void addCoordenador(Coordenador c){
        listaCoordenadores.add(c);
        System.out.println("Coordenador adicionado");
    }

    public List exibirListaCoodenador(){

        return listaCoordenadores;
    }

    public Double calcularTotalProfessores(){

        for (Professor c : listaProfessores){
            totalProfessor +=  c.getValorBonus();
        }
        return totalProfessor;
    }

    public Double calculaSalarioCoordenador(){
        for (Coordenador c : listaCoordenadores){
            totalCoodenador += c.getValorBonus();
        }
        return totalCoodenador;
    }

    public Double calculaTotal(){

        return totalCoodenador+totalProfessor;
    }







}
