package com.mycompany.reforco.exercicioDois;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Biblioteca {
   private String nome;
   private List<Livro> listaLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.listaLivros = new ArrayList<>();
        
    }
   
   public void cadatsrarLivro(Livro livro){
       
       listaLivros.add(livro);
   }
   
   public void exibirLivros(){
       System.out.println(listaLivros);
   }
   
   public void exibirLivrosPorAutor(String autor){
       for (Livro listaLivro : listaLivros) {
           if (listaLivro.getAutor().equals(autor)) {
               System.out.println(listaLivro);
           }
       }
   }
   
   public void exibirLivrosPorCategoria(String categoria){
       for (Livro listaLivro : listaLivros) {
           if (listaLivro.getCategoria().equals(categoria)) {
               System.out.println(listaLivro);
           }
       }
   }
}
