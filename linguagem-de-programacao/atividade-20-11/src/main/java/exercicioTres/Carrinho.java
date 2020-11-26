package exercicioTres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Carrinho {
   private Cliente cliente;
   private Boolean finalizado;
   private List<Produto> listaProdutos;

    public Carrinho(Cliente cliente, Boolean finalizado) {
        this.cliente = cliente;
        this.finalizado = finalizado;
        this.listaProdutos = new ArrayList<>();
    }

   
    
    
   
   public void adicionarProduto(Produto produto){
       listaProdutos.add(produto);
   }
   
   public void removerProduto(Produto produto){
       listaProdutos.remove(produto);
   }
   
   public void finalizarPedido(){
       Double valorTotal= 0.0;

       for (Produto produto : listaProdutos) {
         valorTotal += produto.getPreco();
       }
       System.out.println(toString());
       System.out.println(valorTotal);
   }

    @Override
    public String toString() {
        return "Carrinho{" + "cliente=" + cliente + ", finalizado=" + finalizado + ", listaProdutos=" + listaProdutos + '}';
    }
   
   
   
}
