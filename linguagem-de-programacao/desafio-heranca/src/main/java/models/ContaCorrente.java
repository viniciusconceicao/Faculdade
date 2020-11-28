package models;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> listHistorico; 
    
    
    
   

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.listHistorico = new ArrayList<>();
    }
    
    
    public void depositar(Double valor,Integer dia, Integer mes, Integer ano){
        saldo+=valor;
        
        Historico ocorrencia = new Historico(dia, mes, ano, valor, "Deposito");
        
      listHistorico.add(ocorrencia);
      
    

        }
    
    public void sacar(Double valor,Integer dia, Integer mes, Integer ano){
       if(saldo < valor){
           System.out.println("Saldo insuficiente");
       }else{
        saldo-=valor;
        
        Historico ocorrencia = new Historico(dia, mes, ano, valor, "Sacar");
        
      listHistorico.add(ocorrencia);
       } 
    

        }


    public void exibirExtrato(){
        for (Historico historico : listHistorico) {
            System.out.println(historico);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Historico> getListHistorico() {
        return listHistorico;
    }

    public void setListHistorico(List<Historico> listHistorico) {
        this.listHistorico = listHistorico;
    }

    @Override
    public String toString() {
        
        return "Extrato: "+ listHistorico +
                "\nSaldo atual: "+ getSaldo();
                
    }
    
    
    
    
}
