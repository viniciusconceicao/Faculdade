package com.company;

import com.company.domain.Aluno;
import com.company.services.ListaObj;

import java.util.Scanner;

public class testeListaAluno {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListaObj listaObj = new ListaObj(10);

        Boolean fim = false;


        Integer raAluno, escolhaInput, entrada;
        String nomeAluno;
        Double notaAluno;


        do {

            System.out.println("Informe um número:");

             System.out.println("1. Adicionar aluno" +
                    "\n2. Exibir lista" +
                    "\n3. Exibir um aluno da lista" +
                    "\n4. Limpar lista" +
                    "\n5. Fim");

            entrada = input.nextInt();

            switch (entrada){
                case 1:
                    System.out.println("Informe o ra:");
                    raAluno = input.nextInt();
                    System.out.println("Informe o nome:");
                    nomeAluno = input.next();
                    System.out.println("Informe a nota do aluno:");
                    notaAluno = input.nextDouble();

                    Aluno aluno = new Aluno(raAluno, nomeAluno, notaAluno);
                    System.out.println("Aluno adicionado: "+listaObj.adiciona(aluno));

                    break;

                case 2:
                    listaObj.exibe();
                    break;

                case 3:
                    System.out.println("Informe o indice do aluno.");
                    escolhaInput = input.nextInt();
                    System.out.println(listaObj.getElemento(escolhaInput));
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
        } while (!fim);






    }



}
