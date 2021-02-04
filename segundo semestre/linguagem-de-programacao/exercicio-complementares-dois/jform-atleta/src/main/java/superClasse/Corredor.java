package superClasse;

/**
 *
 * @author vinicius
 */
public class Corredor {
    
    //Atributos
    private String tipoFisico;
    private String performance;
    private Double tempoMedio;

    //Construtor
    public Corredor(String tipoFisico, String performance, Double tempoMedio) {
        this.tipoFisico = tipoFisico;
        this.performance = performance;
        this.tempoMedio = tempoMedio;
    }
    
    
    //Metodos
    public String correr(){
        return toString();
    }
    
    
    
    // Getters e Setters
    public String getTipoFisico() {
        return tipoFisico;
    }

    public void setTipoFisico(String tipoFisico) {
        this.tipoFisico = tipoFisico;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(Double tempoMedio) {
        this.tempoMedio = tempoMedio;
    }
    
    //toString

    @Override
    public String toString() {
        return "\nCorredor" + 
                "\nTipo físico: " + tipoFisico + 
                "\nPerformance: " + performance + 
                "\nTempo médio: " + tempoMedio;
    }
    
    
    
    

    
    
}
