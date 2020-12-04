package models;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class DesafioConversao {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        Integer contadorPai = 0;
        Integer contador = 0;
        String tracos = "-";

   
        do {   
            contadorPai++;
            do {       
            contador++;
            
            System.out.println(tracos.repeat(contador));
            
        } while (contador < 4);
            
            if (contador == 4) {
                contador = 0;
            }
            
            System.out.println(tracos.repeat(contador+4));
            
        } while (contadorPai < 5);
    }
    
}
