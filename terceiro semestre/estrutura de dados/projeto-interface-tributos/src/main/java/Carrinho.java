import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> listaProdutos;

    public Carrinho() {
        this.listaProdutos = new ArrayList<Vendavel>();
    }

    public void adicionaVendavel(Vendavel t){

        listaProdutos.add(t);
        System.out.println("Item adicionado");

    }

    Double valorTotal = 0.0;
    public Double calculaTotalVenda(){
        for (Vendavel lista : listaProdutos){
            valorTotal += lista.getValorVenda();
        }

        return valorTotal;
    }

    public void exibeItensCarrinho(){
        System.out.println(listaProdutos);
    }


}
