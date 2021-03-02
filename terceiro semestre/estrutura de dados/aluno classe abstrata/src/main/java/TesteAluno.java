public class TesteAluno {

    public static void main(String[] args) {
        AlunoFundamental af1 = new AlunoFundamental(011, "Vinicius", 7.0, 4.0, 4.0, 7.0);
        AlunoGraduacao ag1 = new AlunoGraduacao(012, "Winderson", 7.0, 5.0);
        AlunoPos ap1 = new AlunoPos(013, "Jovirone", 7.0, 5.0, 4.0);

        Escola e1 = new Escola("bandtec");

        System.out.println("Aluno fundamental");
        System.out.println(af1.toString());
        System.out.println("Nota:"+af1.calculaMedia());

        System.out.println("\n\nAluno faculdade");
        System.out.println(ag1.toString());
        System.out.println("Nota: "+ag1.calculaMedia());

        System.out.println("\n\nAluno Pós");
        System.out.println(ap1.toString());
        System.out.println("Média: "+ap1.calculaMedia());


        //Adicionando Alunos
        System.out.println("\n\nAdiconando os alunos");
        e1.adicionarAluno(af1);
        e1.adicionarAluno(ag1);
        e1.adicionarAluno(ap1);


        //Exibindo todos os alunos
        System.out.println("\n\nExibindo alunos adicionados");
        e1.exibeTodos();

        //Exibindo Alunos Pós
        System.out.println("\n\nExibindo Alunos Pós");
        e1.exibeAlunosPos();


        //Exibindo Alunos Aprovados
        System.out.println("\n\nExibindo alunos aprovados");
        e1.exibeAlunosAprovados();

        //Buscando alunos
        System.out.println("\n\nBuscando alunos por RA");
        e1.buscarAluno(011);






    }



    }

