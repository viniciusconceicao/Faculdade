/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioTres;

/**
 *
 * @author Aluno
 */
public class TesteCarrinho {
    public static void main(String[] args) {
        Produto p1 = new Produto("Desodorante", 4.50, "Limpeza");
        Produto p2 = new Produto("Coca-Cola", 50.0, "Alimentos");
        Produto p3 = new Produto("Requeijão", 12.50, "Alimentação");
    
        Cliente c1 = new Cliente("Vinicius","23456787");
    
        Carrinho ca1 = new Carrinho(c1, Boolean.TRUE);
        
        ca1.adicionarProduto(p3);
        ca1.adicionarProduto(p2);
        ca1.adicionarProduto(p1);
        
        ca1.removerProduto(p3);
        
        ca1.finalizarPedido();
    }
    
    
}
