package com.company;

public class AppMain {

    public static void main(String[] args) {
        Professor p1 = new Professor("Amandinha", 2, 1000.0);
        Coordenador c1 = new Coordenador("Allan", 1, 60.0);

        ControleBonus cb1 = new ControleBonus();

        cb1.addFuncionario(p1);


        cb1.addFuncionario(c1);


        System.out.println(cb1.exibeLista());

        System.out.println("\nValor total do bonus: "+cb1.calculaSalario());
    }

}
