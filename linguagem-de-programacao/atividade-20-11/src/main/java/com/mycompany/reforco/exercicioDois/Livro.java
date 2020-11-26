package com.mycompany.reforco.exercicioDois;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Vini Boladão dos Vrau
 */
public class Livro {
    //Random aleatorio = new Random();
    
    private Long codigo;
    private String nome;
    private String autor;
    private String categoria;

    public Livro(String nome, String autor, String categoria) {
        this.codigo = ThreadLocalRandom.current().nextLong(0, 50);
        this.nome = nome;
        this.autor = autor;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", categoria=" + categoria + '}';
    }
    
    
}
