package main;

import models.Departamento;
import models.VendedorComissao;
import models.VendedorComissaoMaisFixo;

/**
 *
 * @author vinicius
 */
public class TesteVendedor {
    
    public static void main(String[] args) {
        VendedorComissao v1 = new VendedorComissao("Vinicius");
        
        VendedorComissaoMaisFixo vf1 = new VendedorComissaoMaisFixo("Julieta");
        
        Departamento d1 = new Departamento();
        
        System.out.printf("%3s%25s%10s%10s%10s%10s\n","COD","NOME","VENDAS","TAXA","SALÁRIO","SAL. FIXO");
        System.out.println(v1);       
        
        System.out.println(vf1);
        
        
//        d1.adicionarVendedor(v1);
//        d1.adicionarVendedor(vf1);
        
        System.out.println("\n\n\nSalario total: "+ d1.calculaSalarioTotal()+ "\n\n");
        
        d1.exibirTodos();
    }
    
}
