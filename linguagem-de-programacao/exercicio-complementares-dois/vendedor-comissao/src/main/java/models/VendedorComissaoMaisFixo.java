/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author vinic
 */
public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(String nome) {
        super(nome);
        this.salarioFixo = getAleatorio().nextDouble()*100;
    }

    @Override
    public Double calculaSalario() {
        return super.calculaSalario()+salarioFixo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }
    
    


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    
    
    
    

