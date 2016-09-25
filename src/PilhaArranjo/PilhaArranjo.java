
package PilhaArranjo;

import Arranjo.ListaArranjo;


/**
 *
 * @author Marking
 */
public class PilhaArranjo<E> {
    private ListaArranjo<E> lista;
   private int tamanho;
   

    public PilhaArranjo(int tamanho) {
        this.lista = new ListaArranjo<>(tamanho);
        this.tamanho = tamanho;
    }
    
    //Verificar se a pilha esta vazia;
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    //Inserir elemento na Pilha
    public void push(E o){
        lista.add(o);
    }
    
    //Remover Elemento da pilha
    public E pop(){
      return this.lista.removeLast();
    }
    
    //Retorna elemento no topo da pilha
    public E top(){
        return lista.ultimo();
    }
    //Exibir todos os elementos pilha
    public void imprimir(){
        if(!isEmpty()){
           lista.imprimirReveso();
        }
        
    }       
            
  
    
}
