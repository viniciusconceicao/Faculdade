package com.company;

import com.company.domain.Aluno;
import com.company.services.ListaObj;

public class teste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno(011, "Vinicius", 10.0);
        Aluno a2 = new Aluno(011, "Amanda", 10.0);
        Aluno a3 = new Aluno(011, "Allan", 10.0);
        Aluno a4 = new Aluno(011, "Dan", 10.0);

        ListaObj listaObj = new ListaObj(5);

        System.out.println(listaObj.adiciona(a1));
        System.out.println(listaObj.adiciona(a2));
        System.out.println(listaObj.adiciona(a3));
        System.out.println(listaObj.adiciona(a4));

        System.out.println(listaObj.getElemento(6));

        System.out.println(listaObj.getTamanho());

        listaObj.limpar();

        System.out.println(listaObj.getTamanho());



    }


}
