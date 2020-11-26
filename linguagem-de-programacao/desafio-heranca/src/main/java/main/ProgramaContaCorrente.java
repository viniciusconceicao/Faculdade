package main;

import models.ContaCorrente;
import models.Historico;


/**
 *
 * @author vinic
 */
public class ProgramaContaCorrente {
    public static void main(String[] args) {
         Historico h1 = new Historico(12, 05, 2020, 200.00, "Deposito");
        
        
        ContaCorrente cc1 = new ContaCorrente("Vinicius", 50.0);
        
        
        cc1.depositar(200.00, 05, 10, 1998);
        cc1.sacar(30.0, 15, 06, 1998);
        
        System.out.println(cc1.getSaldo());
        
     
        
    }
    
} 
