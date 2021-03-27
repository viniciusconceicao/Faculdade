package com.company;

public class teste {



    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(9);

        System.out.println("Adicionando valores");
        System.out.println( lista.adiciona(2));
        System.out.println(lista.adiciona(5));
        System.out.println(lista.adiciona(6)+"\n\n");

        System.out.println("Exibindo lista");
        lista.exibe();
        System.out.println("");
        System.out.println("");


        System.out.println("buscando valor");
        System.out.println(lista.buscar(2)+"\n\n");


        System.out.println("Removendo pelo indice");
        System.out.println(lista.removerPeloIndice(10)+"\n\n");

        System.out.println("Atializando lista após remover pelo indice");
        lista.exibe();
        System.out.println("");
        System.out.println("");

        System.out.println("Removendo elemento da lista");
        System.out.println(lista.removeElemento(5)+"\n\n");

        System.out.println("Atualizando após remover elemento");
        lista.exibe();
        System.out.println("");

        System.out.println("Substituindo valores");
        System.out.println(lista.substituir(6, 9));
        System.out.println("");
        System.out.println("");

        System.out.println("Atualizando lista");
        lista.exibe();
        System.out.println("");
        System.out.println("");

        System.out.println("Adicionando mais valores");
        lista.adiciona(7);
        lista.adiciona(7);
        lista.adiciona(7);
        lista.adiciona(7);

        System.out.println("Exibindo lista atualizada");
        lista.exibe();
        System.out.println("");
        System.out.println("");

        System.out.println("Contando valores repetidos");
        System.out.println(lista.contarOcorrencias(7));


    }

}
