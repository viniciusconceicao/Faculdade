package models;



import java.time.LocalDateTime;




/**
 *
 * @author vinic
 */
public class Item {
    
    
    private String descricao;
    private Double valor;
    private LocalDateTime dataAtual;
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Item(String descricao, Double valor, Integer mes, Integer ano) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataAtual = LocalDateTime.now();
        this.mes = mes;
        this.ano = ano;
    }

    
    
    public LocalDateTime getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDateTime dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

   

    @Override
    public String toString() {
        return String.format("\n\nItem" + 
                "\nDescricao %s" + 
                "\nValor: %.2f" + 
                "\nData atual " + dataAtual, descricao, valor );  
//                "\nDia: " + dia 
//                "\nMês " + mes + 
//                "\nAno: " + ano , 
    }

   
    
    
}
