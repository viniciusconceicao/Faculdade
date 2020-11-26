package com.mycompany.exercicio.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class Faculdade {
    private String nome;
    private List<Aluno> listaAluno;

    public Faculdade(String nome) {
        this.nome = nome;
        this.listaAluno = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        listaAluno.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        
        System.out.println("\n\nMatricula cancelada, aluno(s): ");
        
        for (Aluno aluno : listaAluno) {
            
            if (aluno.getRa().equals(ra)) {
                aluno.setAtivo(Boolean.FALSE);
                System.out.println(aluno);
            }
            
            
             
        }
        
       
        
    }
    
    public void exibirAlunos(){
        System.out.println("\n\nLista de Alunos:\n\n");
        for (Aluno aluno : listaAluno) {
            
            System.out.println(aluno);
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        System.out.println("\nLista de alunos por semestre:");
        for (Aluno aluno : listaAluno) {
            if (aluno.getSemestre().equals(semestre)) {
                System.out.println(aluno);
            }}
    }
    
    public void exibirCancelados(){
        
        System.out.println("\n\nLista de alunos concelados:");
        
        for (Aluno aluno : listaAluno) {
            if (!aluno.getAtivo()) {
                System.out.println(aluno);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }
    
    
    
}
