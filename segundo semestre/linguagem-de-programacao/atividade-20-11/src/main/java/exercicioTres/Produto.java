package exercicioTres;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Produto {
    private Long codigo;
    private String nome;
    private Double preco;
    private String categoria;

    public Produto(String nome, Double preco, String categoria) {
        this.codigo = ThreadLocalRandom.current().nextLong(0,50);
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + '}';
    }

    
    
    
}
