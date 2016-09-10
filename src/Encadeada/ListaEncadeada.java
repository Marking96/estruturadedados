
package Encadeada;

/**
 *
 * @author marking
 */
public class ListaEncadeada {
    Celula primeiro;
    Celula ultimo;

    public ListaEncadeada() {
        this.primeiro = new Celula();
        this.ultimo = primeiro;
    }
    
    //Algoritimo para adicionar item na lista.
    public void add(Object o){
        ultimo.proxima = new Celula();
        ultimo = ultimo.proxima;
        ultimo.item = o;
        ultimo.proxima = null;
    }
    
    //Algoritimo para adicionar item em determinada posição.
    public void add(Object o,int posicao){
        Celula aux = primeiro;
        for (int i = 0; i < posicao; i++) {
            aux = aux.proxima;
        }
        Celula aux2 = aux.proxima;
        aux.proxima = new Celula();
        aux.proxima.item = o;
        aux.proxima.proxima = aux2;
    }
    
    
    //Algoritimo para remover o item na lista.
    public Object remove(Object o){
        Celula aux = primeiro;
        while(aux.proxima != null && !aux.proxima.item.equals(o)){
            aux = aux.proxima;
        }
        if(aux.proxima != null){
            Object remove = aux.proxima.item;
            aux.proxima = aux.proxima.proxima;
            return remove;
        }
        if(aux.proxima == null){
            ultimo= aux;
        }
        return null;
    }
    
    //Algoritimo para remover um item na determinada posição.
    public Object remove(int posicao){
       Celula aux = primeiro;
       int i = -1;
       while(aux.proxima != null && i< posicao){
           if((i+1) == posicao){
               Object remove = aux.proxima.item;
               aux.proxima = aux.proxima.proxima;
               return remove;
           }else{
               i++;
               aux = aux.proxima;
           }
               
       }
       return null;
    } 
    
    //Algoritimo para procura um item na lista
    public boolean search(Object o){
        Celula aux = primeiro;
        while(aux.proxima != null){
            if(aux.proxima.item.equals(o)){
                return true;
            }else{
                aux = aux.proxima;
            }
        }
        return false;
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
    public void imprimi(){
        Celula aux = new Celula();
        aux = primeiro;
        while(aux.proxima != null){
            System.out.println(aux.proxima.item);
            System.out.println("------------");
            aux = aux.proxima;
        }
    }
}
