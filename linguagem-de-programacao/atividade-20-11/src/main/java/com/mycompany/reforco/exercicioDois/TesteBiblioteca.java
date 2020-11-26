package com.mycompany.reforco.exercicioDois;

/**
 *
 * @author Mc Pose dos Anos 80
 */
public class TesteBiblioteca {
    public static void main(String[] args) {
         Livro l1 = new Livro("Historia sem fim", "Oscar", "Terror");
         Livro l2 = new Livro("Diario de um banana", "Husley", "Drama");
         Livro l3 = new Livro("O ultimo homem", "Josinei", "Suspense");
         
         Biblioteca b1 = new Biblioteca("Bandtec biblioteca");
         
         b1.cadatsrarLivro(l1);
         b1.cadatsrarLivro(l2);
         b1.cadatsrarLivro(l3);
         
         b1.exibirLivros();
         b1.exibirLivrosPorAutor("Oscar");
         b1.exibirLivrosPorCategoria("Drama");
    }
    
 
}
