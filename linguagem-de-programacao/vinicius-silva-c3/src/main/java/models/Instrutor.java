package models;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author vinic
 */
public class Instrutor {
    
    private Random aleatorio = new Random();
    private String nome;
    private Integer qtdHota;
    private Double valorHora;

    public Instrutor(String nome) {
        this.nome = nome;
        this.qtdHota = aleatorio.nextInt(60);
        this.valorHora = ThreadLocalRandom.current().nextDouble(25.0, 450.0);
    }
    
    public Double calculaSalario(){
        return qtdHota*valorHora*4.5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHota() {
        return qtdHota;
    }

    public void setQtdHota(Integer qtdHota) {
        this.qtdHota = qtdHota;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    
    
    

    @Override
    public String toString() {
        return String.format("\n\nInstrutor: " + 
                             "\nNome: %s" + 
                             "\nHoras trabalhadas: %d" + 
                             "\nValor hora: R$ %.2f" + 
                             "\nSalário calculado: %.2f",nome, qtdHota, valorHora, calculaSalario());
    }
    
    
    
}
