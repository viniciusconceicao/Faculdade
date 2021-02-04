package models;

/**
 *
 * @author vinic
 */
public class Jogo {
  
    private String nome;
    private String categoria;
    private String plataformaDeOrigem;
    private String criador;
    private String empresa;
    private Double preco;

    public Jogo(String nome, String categoria, String plataformaDeOrigem, String criador, String empresa, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.plataformaDeOrigem = plataformaDeOrigem;
        this.criador = criador;
        this.empresa = empresa;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPlataformaDeOrigem() {
        return plataformaDeOrigem;
    }

    public void setPlataformaDeOrigem(String plataformaDeOrigem) {
        this.plataformaDeOrigem = plataformaDeOrigem;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("\n\nJogo" + 
                "\nNome: %s" +
                "\nCategoria: %s" + 
                "\nPlataforma de origem: %s" +
                "\nCriador: %s" +
                "\nEmpresa: %s" + 
                "\nPreço: R$%.2f",nome, categoria, plataformaDeOrigem, criador, empresa, preco);
    }
    
    
    
    
    
}
