package com.company;

import com.company.domain.Aluno;
import com.company.services.ListaObj;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class TesteListaGravaAluno {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListaObj<Aluno> lista;

        Boolean fim = false;


        Integer raAluno, escolhaInput, entrada;
        String nomeAluno, nomeArquivo;
        Double notaAluno;


        do {

            System.out.println("Informe um número:");

            System.out.println("1. Adicionar aluno" +
                    "\n2. Exibir lista" +
                    "\n3. Exibir um aluno da lista" +
                    "\n4. Gravar a lista em um arquivo .txt" +
                    "\n5. Gravar a lista em um arquivo .csv" +
                    "\n6. Ler e exibir o arquivo .txt" +
                    "\n7. Ler e exibir o arquivo .csv" +
                    "\n8. Fim");

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
                    System.out.println("Aluno adicionado: "+lista.adiciona(aluno));

                    break;

                case 2:
                    lista.exibe();
                    break;

                case 3:
                    System.out.println("Informe o indice do aluno.");
                    escolhaInput = input.nextInt();
                    System.out.println(lista.getElemento(escolhaInput));
                    break;

                case 4:


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
