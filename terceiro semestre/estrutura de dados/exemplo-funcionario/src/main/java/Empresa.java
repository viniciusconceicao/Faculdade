import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //Atributo
    private List<Funcionario> lista;

    //Construtor
     public Empresa() {
            this.lista = new ArrayList<Funcionario>();
        }


        //Métodos
    public void addFuncionario(Funcionario f){
        System.out.println("Funcionário adicionado");
         lista.add(f);
    }

    public void exibirTodos(){
        System.out.println("Lista de funcionários:");
        for (Funcionario f : lista){
            System.out.println(f);
        }
    }

    public void exibirTotalSalario(){
         Double total = 0.0;
         for (Funcionario f : lista){
             total += f.calcSalario();
         }
    }

    public void exibirHoristas(){
        System.out.println("Lista dos Horistas:");
        for (Funcionario f : lista){
            if (f instanceof Horista){
                System.out.println(f);
            }
        }
    }
}
