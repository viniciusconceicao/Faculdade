package com.mycompany.exercicio.heranca;

/**
 *
 * @author vinic
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("011", "Vinicius", 2, true);
        Aluno a2 = new Aluno("012", "Amandinha", 3, true);
        Aluno a3 = new Aluno("013", "Allan", 3, true);
        Aluno a4 = new Aluno("014", "Rafa", 1, true);
        
        Faculdade f1 = new Faculdade("Bandtec");
        
        f1.matricularAluno(a4);
        f1.matricularAluno(a3);
        f1.matricularAluno(a2);
        f1.matricularAluno(a1);
        
        f1.exibirAlunos();
        
        f1.cancelarMatricula("014");
        
        f1.exibirAlunos();
        
        f1.exibirAlunosPorSemestre(3);
        
        f1.exibirCancelados();
    }
}
