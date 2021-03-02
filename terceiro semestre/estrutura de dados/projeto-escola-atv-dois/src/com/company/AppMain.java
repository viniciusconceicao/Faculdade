package com.company;

import javax.naming.ldap.Control;

public class AppMain {

    public static void main(String[] args) {

        Professor p1 = new Professor("Amandinha", 2, 1000.00);
        Coordenador c1 = new Coordenador("Allan", 100,
                50.00,80, 80.0);

        ControleBonus cb1 = new ControleBonus();
        cb1.addProfessor(p1);
        cb1.addCoordenador(c1);


        System.out.println(cb1.exibirListaProfessor());
        System.out.println(cb1.exibirListaCoodenador());



    }

}
