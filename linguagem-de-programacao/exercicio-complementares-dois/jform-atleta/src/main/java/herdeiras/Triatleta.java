package herdeiras;

import superClasse.Corredor;

/**
 *
 * @author vinicius
 */
public class Triatleta extends Corredor{

    //Construtor
    public Triatleta(String tipoFisico, String performance, Double tempoMedio) {
        super(tipoFisico, performance, tempoMedio);
    }

    //Metodos
    @Override
    public String correr() {
        return 
        String.format("\nTipo físico: Torneado"+
                      "\nPerformance:  Corre por até uma hora"+
                      "\nTempo médio: 45 Minutos");
    }
    
    
}
