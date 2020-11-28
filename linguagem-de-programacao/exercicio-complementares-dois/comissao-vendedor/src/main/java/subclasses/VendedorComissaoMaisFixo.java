package subclasses;

import raiz.VendedorComissao;

/**
 *
 * @author vinicius
 */
public class VendedorComissaoMaisFixo extends VendedorComissao{
    
    private Double salarioFixo;
  
    
    //Construtor
    public VendedorComissaoMaisFixo(Double salarioFixo, String nome, Double vendas) {
        super(nome, vendas);
        this.salarioFixo = salarioFixo;
    }
    
    
    //Metodos
    
    
    
    
}
