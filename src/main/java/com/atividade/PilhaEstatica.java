package com.atividade;

public class PilhaEstatica {

    public int[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){
        this.elementos = new int[tamanho];
        this.tamanho = tamanho;
        this.topo = -1;
    }

    public void push(int valor) {
        if(isEmpty() == false){
            System.out.println("Erro: a pilha está cheia!");
        }
        topo = topo + 1;
        elementos[topo] = valor;
        //quebrar ou botar um else
    }

    public int pop(){
        int remove;

        if(isEmpty()){
            return -1;
        }
        else {
            remove = elementos[topo];
            topo = topo - 1;
            return remove;
        }
    }

    public boolean isEmpty(){
        return this.topo == -1;
    }

    public int peek(){
        return elementos[topo];
    }
}