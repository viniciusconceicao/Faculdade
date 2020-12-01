package main;

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
        
        System.out.println(v1.toString());
        
        
        //System.out.println(vf1.toString());
    }
    
}
