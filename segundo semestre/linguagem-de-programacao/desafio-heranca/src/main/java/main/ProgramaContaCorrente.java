package main;

import models.ContaCorrente;


/**
 *
 * @author vinic
 */
public class ProgramaContaCorrente {
    public static void main(String[] args) {
       ContaCorrente cc1 = new ContaCorrente("Vinicius", 50.0);
       
       cc1.depositar(200.00, 15, 05, 2020);
       cc1.sacar(2000.00, 21, 3,2020);
       cc1.sacar(30.00, 16, 05, 2020);
       
        System.out.println(cc1.exibirExtrato());
        
        
        
        
     
        
    }
    
} 
