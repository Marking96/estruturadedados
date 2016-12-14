
package FilaEncadeada;

import Arranjo.ListaArranjo;
import Arvore.Arvore;
import Encadeada.ListaEncadeada;

/**
 *
 * @author Marking
 
 */
public class FilaEncadeada <E>{
    private ListaEncadeada<E> lista;
    
    public FilaEncadeada() {
        this.lista = new ListaEncadeada<>();
    }
    //Verificar se a fila esta vazia
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    //Adicionar elemento na fila 
    public void enfileira(E o){
        lista.add(o);
    }
    
    //remover elemento da fila
    public E desenfileira(){
        return lista.removeFirst();
    }
    
    //retorna o tamanho da fila
    public int size(){
        return lista.size();
    }
    
    //exibir elementos da fila
    public void exibir(){
        lista.imprimir();
    }

    
}
