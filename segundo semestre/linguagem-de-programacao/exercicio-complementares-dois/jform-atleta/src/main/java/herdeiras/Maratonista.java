package herdeiras;

import superClasse.Corredor;

/**
 *
 * @author vinicius
 */
public class Maratonista  extends Corredor{

    //Construtor
    public Maratonista(String tipoFisico, String performance, Double tempoMedio) {
        super(tipoFisico, performance, tempoMedio);
    }

    
    //Metodos
    @Override
    public String correr() {
        return 
        String.format("\nTipo físico: Magro"+
                      "\nPerformance:  Corre por horas"+
                      "\nTempo médio: 2 horas");
    }
    
    
}
