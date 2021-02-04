package com.mycompany.reforco;

import java.util.Random;

/**
 *
 * @author Mc Vininho da Quabrada
 */
public class BilheteUnico {

    private String cpf;
    private Double saldo;
    private String titular;
    private Integer qtdPassagem = 0;
    Random aleatorio = new Random();
    Double valorRecarga = aleatorio.nextDouble() * 100;

    public BilheteUnico(String cpf, Double saldo, String titular) {
        this.cpf = cpf;
        this.saldo = saldo;
        this.titular = titular;
    }

    

    

    public void recarga(Double saldo) {
        if (saldo + aleatorio.nextDouble() > 250) {
            System.out.println(" Recarga não disponível acima do saldo 250,"
                    + "\n Saldo atual: " + saldo);
        } else {
          this.saldo += valorRecarga;
            System.out.println(String.format(
                    "Valor da recarga: %.2f"
                    + "\n Saldo atual: %.2f", valorRecarga, saldo
            ));
        }

        
    }

    public void passagemComum() {

        if (saldo > 4.50) {

            System.out.println(String.format("Passagem autorizada."
                    + "\nValor da passagem: R$4,50"
                    + "\nSaldo atual: %.2f", saldo -= 4.50));

            qtdPassagem++;

        } else {
            System.out.println("Saldo insulficiente, favor realizar recarga");
        }
    }

    public void passagemIntegracao() {
        if (qtdPassagem >= 1 && qtdPassagem <= 4) {
            saldo -= 1.50;
            qtdPassagem++;
            System.out.println(String.format("Passagem autorizada."
                    + "Valor da passagem: R$1,50"
                    + "\nSaldo atual: %.2f", saldo));

        } else if (qtdPassagem > 4) {
            passagemComum();
        }

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getQtdPassagem() {
        return qtdPassagem;
    }

    public void setQtdPassagem(Integer qtdPassagem) {
        this.qtdPassagem = qtdPassagem;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

}
