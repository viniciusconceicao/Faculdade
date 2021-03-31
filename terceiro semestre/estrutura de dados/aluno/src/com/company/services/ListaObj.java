package com.company.services;

public class ListaObj <T> {


    private T[] vetor;
    Integer ultimaPosicao;

    public ListaObj(Integer tam) {
        this.vetor = (T[]) new Object[tam];
        this.ultimaPosicao = 0;
    }

    public Boolean adiciona(T valor) {

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

    public Integer buscar(T valor) {
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

    public Boolean removeElemento(T valor){
        return removerPeloIndice(buscar(valor));
    }



    public Boolean substituir(T valorAntigo, T novoValor){

        for (int i = 0; i < vetor.length; i++) {
            if (valorAntigo.equals(vetor[i])){
                vetor[i] = novoValor;
                return true;
            }

        }
        return false;
    }


    public Integer getTamanho(){

        return ultimaPosicao;

    }

    public T getElemento(Integer indice){
        for (int i = 0; i < ultimaPosicao; i++) {
            if (indice < 0 || indice > ultimaPosicao){
                return (T) "Indice inválido";
            }

        }
        return vetor[indice];
    }

    public void limpar(){
        ultimaPosicao = 0;
    }



}

