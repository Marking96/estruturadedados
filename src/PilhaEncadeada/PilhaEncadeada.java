
package PilhaEncadeada;

import Encadeada.ListaEncadeada;

/**
 *
 * @author Marking
 */
public class PilhaEncadeada <E>{
    private ListaEncadeada<E> lista;

    public PilhaEncadeada() {
        this.lista = new ListaEncadeada<>();
    }
    
    //Verificar se a pilha esta vazia;
     public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    //Inserir elemento na Pilha
    public void push(E o){
        lista.addFirst(o);
    }
   
    //Remover Elemento da pilha
    public E pop(){
        return lista.removeFirst();
    }
    
    //Retorna elemento no topo da pilha
    public E top(){
        return lista.first();
    }
    
    //Exibir todos os elementos pilha
    public void exibir(){
        lista.imprimir();
    }
}
