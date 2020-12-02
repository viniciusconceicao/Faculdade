package models;

/**
 *
 * @author vinic
 */
public class App {
    
    public static void main(String[] args) {
        
        //Instrutores
        Instrutor i1 = new Instrutor("Vinicius");
        
        
        
       //Personais
        Personal p1 = new Personal("Amanda");
        Personal p3 = new Personal("Claudemiro");
        
        //Academia
        Academia a1 = new Academia("Iron men");
    
        
        System.out.println("Informações da academia");
        System.out.println(a1);
        System.out.println("-----------------------");
        
        
        
        System.out.println("\n\nExibindo Instrutores");
        System.out.println(i1);
        System.out.println("--------------------");
        
        
        
        System.out.println("\n\nExibir Personais");
        System.out.println(p1);
        System.out.println(p3);
        System.out.println("---------------------");
        
        
        
        
        a1.contratarInstrutor(i1);
        a1.contratarInstrutor(p1);
        a1.contratarInstrutor(p3);
        
        
        
        
        System.out.println("\n\nExibindo todos os instrutores como metodo");
        a1.exibirInstrutores();
        System.out.println("--------------------------");
        
        
        
        
        System.out.println("Exibindo Personal Treiners");
        a1.exibirPersonalTreiner();
        System.out.println("-------------------------");
        
        
        
        
        
        System.out.println("\n\nFolha de pagamento");
        a1.exibeFolhaDePagamento();
        System.out.println("-------------------");
        
        
        
        
        Personal p4 = new Personal("Alex");
        
        
        
        
        a1.contratarInstrutor(p4);
        
        
        
        
        System.out.println("\n\nInformações da academia - atualizada");
        System.out.println(a1);
        System.out.println("-----------------------");
        
     
        
        
        
    }
    
    
    
}
