package com.mycompany.reforco;

import java.util.Random;

/**
 *
 * @author Vininho Mostro do Baile
 */
public class TesteBilhete {
    Random aleatorio = new Random();
    public static void main(String[] args) {
        BilheteUnico bilhete = new BilheteUnico("658.385.374-80", 51.00, "Isabella");
        
        bilhete.recarga(bilhete.getSaldo());
        System.out.println(bilhete.getSaldo());
        bilhete.passagemComum();
        bilhete.passagemIntegracao();
        bilhete.passagemIntegracao();
        bilhete.passagemIntegracao();
        bilhete.passagemIntegracao();
        bilhete.passagemComum();
        
    }
}
