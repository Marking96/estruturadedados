/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore.BinariaBusca;

import Arvore.BinariaBusca.No;
import PilhaEncadeada.PilhaEncadeada;

/**
 *
 * @author Marking
 */
public class ArvoreBinariaBusca {

    private No raiz;

    public ArvoreBinariaBusca() {

    }

    public void inserir(int key, int valor) {
        raiz = inserir(raiz, key, valor);
    }

    private No inserir(No no, int key, int valor) {
        if (no == null) {
            return new No(key, valor);
        } else if (key < no.getKey()) {
              no.setEsquerda(inserir(no.getEsquerda(), key, valor)); 
        } else if (key > no.getKey()) {
                no.setDireita(inserir(no.getDireita(), key, valor));
        }else{
            no.setValor(valor);
        }
        return no;
    }
   
    public void remover(int key) {
        remover(this.raiz, key).getValor();
    }

    private No remover(No no,int key) {
        if (no == null) {
            
            return null;
        }else {
           if(key<no.getKey()){
               no.setEsquerda(remover(no.getEsquerda(),key));
           }else if(no.getKey() > key){
               no.setDireita(remover(no.getDireita(),key));
           }else if(no.getEsquerda() != null && no.getDireita() != null){
               no.setKey(removeMinimo(no.getDireita()).getKey());
               no.setDireita(removeMinimo(no.getDireita()));
           }
           else{
               if(no.getEsquerda() != null){
                   no = no.getEsquerda();
               }else{
                   no = no.getDireita();
               }
           }
        return no;
    }
  }
    public int encontraMinino (){
        return encontraMinimo(raiz).getValor();
    }
    
    private No encontraMinimo(No no) {
        if (no != null) {
            while (no.getEsquerda() != null) {
                no = no.getEsquerda();
            }
        }
        return no;
    }

    public int encontraMax(){
        return encontraMax(raiz).getValor();
    }
    
    private No encontraMax(No no){
        if(no.getDireita() == null){
            System.out.println("vazia");
        }else{
            while(no.getDireita()!= null){
                no = no.getDireita();
            }
        }
        return no;
    }
    private No removeMinimo(No no) {
        if (no == null) {
            System.out.println("Arvore Vazia");
        } else if (no.getEsquerda() != null) {
            no.setEsquerda(removeMinimo(no.getEsquerda()));
            return no;
        } else {
            return no.getDireita();
        }
        return null;
    }

    public void show() {
        if (this.raiz == null) {
            System.out.println("Arvore vazia");
        } else {
            System.out.println("O elemento do meio é a raiz!!");
            prefixa(this.raiz);
        }
    }

    private void prefixa(No no) {
        if (no != null) {

            prefixa(no.getEsquerda());
            System.out.println("");
            System.out.print(no.getValor() + ",");
            prefixa(no.getDireita());
        }
    }
    
    public boolean buscaProfundidade(int valor){
        PilhaEncadeada pilha = new PilhaEncadeada();
        No aux;
        pilha.push(raiz);
        while(!pilha.isEmpty()){
            aux = (No) pilha.pop();
            if(aux.getValor() == valor){
                return true;
            }
            else if(aux.getEsquerda()!= null){
                pilha.push(aux.getEsquerda());
            }else if(aux.getEsquerda() != null){
                pilha.push(aux.getDireita());
            }
        }
        return false;
    }
}
