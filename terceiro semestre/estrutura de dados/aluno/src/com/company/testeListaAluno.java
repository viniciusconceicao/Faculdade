package com.company;

import com.company.domain.Aluno;
import com.company.services.ListaObj;

import java.util.Scanner;

public class testeListaAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListaObj listaObj = new ListaObj(10);

        Boolean fim = false;


        Integer raAluno, escolhaInput, entrada = input.nextInt();
        String nomeAluno;
        Double notaAluno;

        do {

            System.out.println("1. Adicionar aluno" +
                    "\n2. Exibir lista" +
                    "\n3. Exibir um aluno da lista" +
                    "\n4. Limpar lista" +
                    "\n5. Fim");

                switch (entrada){
                    case 1:
                        raAluno = input.nextInt();
                        nomeAluno = input.next();
                        notaAluno = input.nextDouble();
                        Aluno aluno = new Aluno(raAluno, nomeAluno, notaAluno);
                        listaObj.adiciona(aluno);
                        break;

                    case 2:
                        listaObj.exibe();
                        break;

                    case 3:
                        System.out.println("Informe o indice do aluno.");
                        escolhaInput = input.nextInt();
                        listaObj.getElemento(escolhaInput);
                        break;

                    case 4:
                        listaObj.limpar();
                        break;

                    case 5:
                        fim = true;
                        break;

                    default:
                        System.out.println("Número inválido");
                        break;
                }


        } while (entrada.equals(6));
    }



}
