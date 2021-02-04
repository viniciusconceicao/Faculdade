package models;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vinic
 */
public class Pedido {
    
    private Jogo j;
    
    private Long codigo;
    private Cliente cliente;
    private List<Jogo> jogos;
    private Boolean finalizado = false;
    private List<List>listaPedido;

    public Pedido(Cliente cliente) {
        this.codigo = ThreadLocalRandom.current().nextLong(100, 200);
        this.cliente = cliente;
        this.jogos = new ArrayList<>();
        this.listaPedido = new ArrayList<>();
    }
    
    public void adicionarJogoAoPedido(Jogo jogo){
            
        if (!finalizado) {
            jogos.add(jogo);
            System.out.println("Item adicionado");
        }
        else if (finalizado) {
            System.out.println("Compra finalizada, não é possivel adicionar!");
        }

    }
    
    public void adicionarJogoAoPedido(String nome,String categoria,
            String plataformaDeOrigem, String criador,String empresa,Double preco){
        
        if (!finalizado) {
            j = new Jogo(nome, categoria, plataformaDeOrigem, criador, empresa, Double.NaN);
            
            jogos.add(j);
        }
        else if (finalizado) {
            System.out.println("Compra finalizada, não é possivel adicionar!");
        }
        
    }
    
    
    public void removerJogoPorNome(String nome){
        for (Jogo jogo : jogos) {
            if (jogo.getNome().equals(nome)) {
                jogos.remove(jogo);
               
            }
            
            else if (j.getNome().equals(nome)) {
                jogos.remove(j);
            }
           
        }
    }
    
    
    public void adicionarVariosJogosAoPedido(){
        if (!finalizado) {
           listaPedido.add(jogos);
            System.out.println(listaPedido);
        }
    }
    
    
    public void listarJogosAdicionados(){
        System.out.println(jogos);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Jogo getJ() {
        return j;
    }

    public void setJ(Jogo j) {
        this.j = j;
    }

    public List<List> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<List> listaPedido) {
        this.listaPedido = listaPedido;
    }
    
    

    @Override
    public String toString() {
        return "\n\nPedido" + 
                "\nCoódigo: " + codigo + 
                "Cliente: " + cliente + 
                "Jogos: " + jogos + 
                "\nFinalizado: " + finalizado;
    }
    
    
    
    
    
    
    
    
}
