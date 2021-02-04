package herdeiras;

import superClasse.Corredor;

/**
 *
 * @author vinicius
 */
public class Velocista extends Corredor {

    //Construtor
    public Velocista(String tipoFisico, String performance, Double tempoMedio) {
        super(tipoFisico, performance, tempoMedio);
    }

    //Metodos
    @Override
    public String correr() {
        return 
        String.format("\nTipo físico: Musculoso"+
                      "\nPerformance:  Corre por alguns segundos"+
                      "\nTempo médio: 30 segundos");
    }
    
    
   
}
