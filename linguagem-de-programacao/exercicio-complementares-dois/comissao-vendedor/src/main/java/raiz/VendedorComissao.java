package raiz;

import java.util.Random;

/**
 *
 * @author vinicius
 */
public class VendedorComissao {
    //Atributos
    Random aleatorio;
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa = 1.1;

    
    
    //Construtor
    public VendedorComissao( String nome, Double vendas) {
        this.codigo = new Random().nextInt(123);
        this.nome = nome;
        this.vendas = vendas;
    }
    
    
    
    //Metodos
    public Double calculaSalario(){
        return this.vendas*taxa;
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
        return "\nVendedorComissao: " + 
                "\nCódigo: " + codigo + 
                "\nNome: " + nome + 
                "\nTotal ganho: " + calculaSalario();
    }

    
    
    
    
    
}
