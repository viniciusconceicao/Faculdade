package models;

import java.util.Random;

/**
 *
 * @author vinicius
 */
public class VendedorComissao {
    
    //Atributos
     private Random aleatorio = new Random(); 
     private Integer codigo;
     private String nome;
     private Double vendas;
     private Double taxa;

     
     //Construtor
    public VendedorComissao(String nome) {
        this.codigo = aleatorio.nextInt(50);
        this.nome = nome;
        this.vendas = aleatorio.nextDouble()*100;
        this.taxa = 1.1 ;
    }
    
    
    //Getters e Setters
    public Double calculaSalario(){
        return vendas*taxa;
    }
    
    
    //Getters e Setters
    public Random getAleatorio() {
        return aleatorio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public Double getTaxa() {
        return taxa;
    }
     
     
    //toString
    @Override
    public String toString() {
        return  String.format("%3d%25s%10.2f%10.2f%10.2f", codigo, nome,vendas,taxa,calculaSalario());
                            
                
//                "\n" +
//                 "\nVendedor Comissao " + 
//                 "\nCódigo: " + codigo +
//                 "\nNome: " + nome +
//                 "\nVendas: " + vendas + 
//                 "\nTaxa: 10" + 
//                 "\nSalário: " + calculaSalario();
    }
    
     
}
