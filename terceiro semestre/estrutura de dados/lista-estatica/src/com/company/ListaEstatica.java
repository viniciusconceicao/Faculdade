package com.company;


public class ListaEstatica {

    Integer[] vetor;
    Integer ultimaPosicao;

    public ListaEstatica(Integer tam) {
        this.vetor = new Integer[tam];
        this.ultimaPosicao = 0;
    }

    public Boolean adiciona(Integer valor) {

        if (ultimaPosicao < vetor.length) {
            vetor[ultimaPosicao] = valor;
            ultimaPosicao++;
            return true;
        } else {
            return false;
        }

    }

    public void exibe() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public Integer buscar(Integer valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (valor.equals(vetor[i])) {
                return i;
            }
        }
        return -1;
    }

    public Boolean removerPeloIndice(Integer indice) {
        if (indice > ultimaPosicao || indice < 0) {
            return false;
        } else{

            for (int i = indice; i < vetor.length; i++) {

                if (i+1 > ultimaPosicao){
                    vetor[i] = vetor[i];
                } else {
                    vetor[i] = vetor[i + 1];
                }

            }
            ultimaPosicao--;
            return true;
        }



    }

    public Boolean removeElemento(Integer valor){
        return removerPeloIndice(buscar(valor));
    }



    public Boolean substituir(Integer valorAntigo, Integer novoValor){

        for (int i = 0; i < vetor.length; i++) {
            if (valorAntigo.equals(vetor[i])){
                vetor[i] = novoValor;
                return true;
            }

        }
        return false;
    }

    Integer contador;
    public Integer contarOcorrencias(Integer valor){

        for (int i = 0; i < ultimaPosicao; i++) {
            
        }


        return contador;
    }

}
