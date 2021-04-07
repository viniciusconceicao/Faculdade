package com.company.services;

import com.company.domain.Aluno;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class Exportacao {
    private String nomeArquivo;
    ListaObj<Aluno> lista = new ListaObj<>(10);


    public Boolean gravarCSV(){
        FileWriter arq = null;
        Formatter saida = null;
        Boolean isIncorrect = false;

        nomeArquivo+=".csv";

        try {
            arq = new FileWriter(nomeArquivo);
            saida = new Formatter(arq);
        } catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (Aluno aluno : lista){
               saida.format("%d;%s;%.2f%n",aluno.getRa(), aluno.getNome(), aluno.getNota());
            }
        } catch (FormatterClosedException erro){
            System.err.println("Erro ao gravar arquivo");
            isIncorrect = true;
        }
            return false;
    }

}
