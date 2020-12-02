package models;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vinic
 */
public class Personal extends Instrutor{
    
    private Integer qtdHotasPersonal;
    private Double valorHoraPersonal;

    public Personal(String nome) {
        super(nome);
        this.qtdHotasPersonal = getAleatorio().nextInt(60);
        this.valorHoraPersonal = ThreadLocalRandom.current().nextDouble(50.0, 400.0);
    }

    

    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + (qtdHotasPersonal * valorHoraPersonal * 4.5);
    }

    public Integer getQtdHotasPersonal() {
        return qtdHotasPersonal;
    }

    public void setQtdHotasPersonal(Integer qtdHotasPersonal) {
        this.qtdHotasPersonal = qtdHotasPersonal;
    }

    public Double getValorHoraPersonal() {
        return valorHoraPersonal;
    }

    public void setValorHoraPersonal(Double valorHoraPersonal) {
        this.valorHoraPersonal = valorHoraPersonal;
    }

 
    
    @Override
    public String toString() {
        return String.format(super.toString());
    }
    
    
    
    
    
    
}
