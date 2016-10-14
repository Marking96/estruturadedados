
package Encadeada;

/**
 *
 * @author marking
 */
public class ListaEncadeada<E> {
    Celula primeiro;
    Celula ultimo;

    public ListaEncadeada() {
        this.primeiro = new Celula();
        this.ultimo = primeiro;
    }
    
    //Algoritimo para adicionar item no final lista.
    public void add(E o){
        ultimo.proxima = new Celula();
        ultimo = ultimo.proxima;
        ultimo.item = o;
        ultimo.proxima = null;
    }
    
    //Algoritimo para adicionar item em determinada posição.
    public void add(E o,int posicao){
        Celula aux = primeiro;
        if(posicao<=size()){
            for (int i = 0; i < posicao; i++) {
                aux = aux.proxima;
            }
            Celula aux2 = aux.proxima;
            aux.proxima = new Celula();
            aux.proxima.item = o;
            aux.proxima.proxima = aux2;
        }
    }
    
    //Algoritimo para adicionar um elemento no inicio da lista.
    public void addFirst(E o){
        Celula aux = new Celula();
        aux.item = o;
        aux.proxima = primeiro.proxima;
        primeiro.proxima = aux;
    }
    
    //Algoritimo para remover o item na lista.
    public E remove(E o){
        Celula aux = primeiro;
        while(aux.proxima != null && !aux.proxima.item.equals(o)){
            aux = aux.proxima;
        }
        if(aux.proxima != null){
            E remove = (E) aux.proxima.item;
            aux.proxima = aux.proxima.proxima;
            return remove;
        }
        if(aux.proxima == null){
            ultimo= aux;
        }
        return null;
    }
    
    //Algoritimo para remover um item na determinada posição.
    public E remove(int posicao){
       Celula aux = primeiro;
       int i = -1;
       while(aux.proxima != null && i< posicao){
           if((i+1) == posicao){
               E remove = (E) aux.proxima.item;
               aux.proxima = aux.proxima.proxima;
               return remove;
           }else{
               i++;
               aux = aux.proxima;
           }
               
       }
       return null;
    } 
    
    //Algoritimo para remover o elemento no começo da lista.
    public E removeFirst(){
        E aux = (E) primeiro.proxima.item;
        primeiro.proxima = primeiro.proxima.proxima;
        return aux;
    }
    
    //Algoritimo para procura um item na lista
    public int search(E o){
        Celula aux = primeiro;
        int i = -1;
        while(aux.proxima != null){
            i++;
            if(aux.proxima.item.equals(o)){
                return i;
            }else{
                aux = aux.proxima;
            }
        }
        return -1;
    }
    
    //Algoritimo para exibir o primeiro item da lista
    public E first(){
        return (E) primeiro.proxima.item;
    }
    //Verificar se a lista esta vazia.
    public boolean isEmpty(){
        //Celula aux = ultimo;
        if(ultimo == primeiro){
            return true;
        }else{
            return false;
        }
    }
    
    //Algoritimo para retorna o tamanho da lista.
    public int size(){
        Celula aux = primeiro;
        int cont = 0;
        while(aux.proxima != null){
            cont ++;
            aux = aux.proxima;
        }
        return cont;
    }
    
    //Algoritimo para exibir itens da lista.
    public void imprimir(){
        Celula aux = new Celula();
        aux = primeiro;
        while(aux.proxima != null){
            System.out.println(aux.proxima.item);
            
            aux = aux.proxima;  
        }
        System.out.println("===========Fim de exibição=========");
       
    }
    
    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula<E> x = primeiro.proxima;
      
        while(x != null){
          
        builder.append(x.item);
            builder.append(",");
         x = x.proxima;
              
        }
        
       builder.append("]");
       
       return builder.toString();
    }
}

