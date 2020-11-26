package models;

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
    
    Historico h1 = new Historico(05, 12, 2020, 50.00, "Vinicius");
    
    
   

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.listHistorico = new ArrayList<>();
    }
    
    
    public void depositar(Double valor,Integer dia, Integer mes, Integer ano){
      
        for (Historico historico : listHistorico) {
            System.out.println(String.format("\n\nOperação: Deposito"
                                        +"\nSaldo anterior: %.2f"
                                        +"\nValor deposito: %.2f"
                                        +"\nSaldo atual: %.2f"
                                        +"\nData %d/%d/%d" , saldo,valor, saldo+=valor, dia, mes, ano ));
        }


        
        listHistorico.add(h1);
        
    }
    
    
    public void sacar(Double valor,Integer dia, Integer mes, Integer ano){
        System.out.println(String.format("\n\nOperação: Saque"
                                        +"\nSaldo anterior: %.2f"
                                        +"\nValor deposito: %.2f"
                                        +"\nSaldo atual: %.2f"
                                        +"\nData %d/%d/%d" , saldo,valor, saldo-=valor, dia, mes, ano )); 
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
    
    
}
