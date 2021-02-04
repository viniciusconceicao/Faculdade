package main;

import models.Cliente;
import models.Jogo;
import models.Pedido;

/**
 *
 * @author vinic
 */
public class TesteLoja {
    
    public static void main(String[] args) {
        Jogo j1 = new Jogo("Valorant", "FPS", "PC", "Rito Gomes", "Riot Games", 0.0);
        
        Cliente c1 = new Cliente("Vinicius", "482.966.548.30");
        
        Pedido p1 = new Pedido(c1);
        
        p1.adicionarJogoAoPedido(j1);
        p1.adicionarJogoAoPedido("Bomberman", "Ação", "Nintendo", "Masanori Yasuda", "Nintendo", 30.0);
        
        
      p1.listarJogosAdicionados();
      
       p1.adicionarVariosJogosAoPedido();
        
        p1.removerJogoPorNome("Bomberman");
        
        p1.listarJogosAdicionados();
    }
    
}
