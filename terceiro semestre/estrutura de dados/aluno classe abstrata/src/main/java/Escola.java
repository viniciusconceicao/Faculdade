import java.util.ArrayList;
import java.util.List;

public class Escola {

    //Atributos
    private String nome;
    private List<Aluno> listaAlunos;

    //Construtor

    public Escola(String nome) {
        this.nome = nome;
        this.listaAlunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno a){
        System.out.println("Aluno adicionado");
        listaAlunos.add(a);
    }

    public void exibeTodos(){
        System.out.println(listaAlunos);
    }

    public void exibeAlunosPos(){
        for (Aluno aluno : listaAlunos){
            if (aluno instanceof AlunoPos){
                System.out.println(aluno);
            }
        }
    }

    public void exibeAlunosAprovados(){
        for (Aluno aluno : listaAlunos ){
            if (aluno.calculaMedia() >= 6){
                System.out.println(aluno);
            }
        }
    }

    public void buscarAluno(Integer ra){
        for (Aluno aluno : listaAlunos){
            if (aluno.getRa().equals(ra)){
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

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
