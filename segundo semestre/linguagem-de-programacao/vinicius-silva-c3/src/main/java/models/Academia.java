package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class Academia {
    
    private Instrutor i;
    private String nome;
    private Integer vagas;
    private List<Instrutor> instrutores;

    public Academia(String nome) {
        this.nome = nome;
        this.vagas = 3;
        this.instrutores = new ArrayList<>();
    }
    
    
    public void contratarInstrutor(Instrutor instrutor){
        if (vagas > 0) {
            instrutores.add(instrutor);
            vagas--;
        }
        else if (vagas <= 0) {
            System.out.println(String.format("A academia %s não possuí vagas disponíveis para contratar o(a) %s", nome,instrutor.getNome()));
        }
    }
    
    public void exibirInstrutores(){
        if (!instrutores.isEmpty()) {
            System.out.println(instrutores);
        }
        else if (instrutores.isEmpty()) {
            System.out.println(String.format("A academia %s não possuí instrutores", nome));
        }
    }
    
    public void exibirPersonalTreiner(){
        if (!instrutores.isEmpty()) {
            for (Instrutor instrutore : instrutores) {
                if(instrutore instanceof Personal){
                    System.out.println(instrutore);
                }
                else if (instrutores.isEmpty()) {
                    System.out.println(String.format("A academia %s não possuí personal trainers", nome));
                }
            }
        }
    }
    
    public void exibeFolhaDePagamento(){
       Double totalSalario = 0.0;
        for (Instrutor instrutore : instrutores) {
            System.out.println("Nome do Instrutor: " + instrutore.getNome());
            System.out.println(String.format("Salário: R$ %.2f", instrutore.calculaSalario()));
            totalSalario+=instrutore.calculaSalario();
        }
        System.out.println(String.format("Total de gastos com salário: R$ %.2f",totalSalario));   
    }


    
    
    @Override
    public String toString() {
        return "\nAcademia" +"\nNome: " + nome + 
                "\nVagas: " + vagas + 
                "\nInstrutores: " + instrutores;
    }
    
    
    
    
    
    
    
    
}
