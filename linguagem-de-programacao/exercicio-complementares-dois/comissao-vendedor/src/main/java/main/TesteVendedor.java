package main;

import raiz.VendedorComissao;

/**
 *
 * @author vinic
 */
public class TesteVendedor {

    public static void main(String[] args) {
        VendedorComissao v1 = new VendedorComissao("Vinicius", 300.0);
       
        
        System.out.println(v1.toString());
    }
}
