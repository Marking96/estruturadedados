
package Arranjo;

import java.util.Scanner;

/**
 *
 * @author marking
 */
public class ListaArranjo<E> {
    private int ultimo = 0;
    private int tamanho;
    E item[];
    
    public ListaArranjo(int tamanho){
        this.tamanho = tamanho;
        this.item = (E[])new Object[this.tamanho];
    }
    
    //Algoritimo para verificar se a lista esta vazia.
    public boolean isEmpty(){
        if(ultimo == 0){
            return true;
        }else{
           return false; 
        }    
    }
    
    //Adicionando item a lista
    public void add(E o){
        if(ultimo < tamanho){
            item[ultimo] = o;
            ultimo++;
        }else{
            capacidade();
            item[ultimo] = o;
            ultimo++;
        }
        
    }
    //Algoritimo para adicinar elemento em uma determinada posição.
    public boolean add(Object o,int p){
       if(p<0 || p>tamanho ){
           return false;
       }
       if(ultimo == tamanho){
            capacidade();
       }
       E aux[] =  (E[])new Object[this.tamanho];
       for(int i=0;i<ultimo;i++){
            aux[i]=this.item[i];
       }
       item = aux;
       for(int i=ultimo; i>p;i--){
           item[i] = item[i-1];
       }
       ultimo = ultimo+1;
       item[p] = (E)o;
       return true;
       
    }
    
    //removendo item
    public E remove(E o){
        E aux = null;
        for (int i = 0; i < ultimo; i++) {
            if(item[i].equals(o)){
               
                aux = item[i];
                for (int j = i; j < ultimo-1; j++) {
                    item[j] = item[j+1];
                }
                item[ultimo-1] = null;
                ultimo--;
                if(ultimo == tamanho/2){
                    reduzirCapacidade();
                }
                
                break;                    //para remover o primeiro item, caso tenha mais de um igual.
            }
        }
        return aux;
        
    }
    
      //removendo por posição
    public E remove(int posicao){
        E aux = null;
        for (int i = 0; i < ultimo; i++) {
            if(posicao == i){
                aux = item[i];
                for (int j = i; j < ultimo-1; j++) {
                    item[j] = item[j+1];
                }
                item[ultimo-1] = null;
                ultimo--;
                if(ultimo <= tamanho/2){
                    reduzirCapacidade();
                }
            }
        }
        return aux;
    }
    
    //remover o ultimo item da lista
    public E removeLast(){
        E aux = (E) item[ultimo-1];
        remove(ultimo-1);
        return aux;
    }
    
    //procuando o item na lista
    public boolean search(Object o){
        for (int i = 0; i < ultimo-1; i++) {
            if(o.equals(item[i])){
                return true;
            }   
        }
        return false;
        
    }
    
    //retorna o ultimo elemento da lista.
    public E ultimo(){
        if(!isEmpty()){
            return item[ultimo-1];
        }
        return null;
    }
    
    //doblando o tamanho da lista
    private void capacidade(){
       E aux[] = (E[])new Object[tamanho*2];
        for (int i = 0; i < ultimo; i++) {
            aux[i] = item[i];
        }
        tamanho = tamanho*2;
        item = aux;
    }
    
    //Algoritimo para reduzir tamanho da lista.
    private void reduzirCapacidade(){
        this.tamanho = (int) (tamanho*0.75);
        
    }
    
    //Algoritimo improvisado 
    public void removeplus(E o){
        int cont = 0;                                                   //Contador para quantas vezes o item tá na lista.
        int[] pos = new int[10];                                        //array para armazena as posições
        for (int i = 0; i < ultimo; i++) {
            if (o.equals(item[i])) {                                    //procurando item.
                pos[cont] = i;                                          //armazenando posições
                cont++;                                                 //imclementando o contador
            }
        }
        if (cont > 1) {                                                 //se o contador for maior que 1
            System.out.println("O mesmo item foi encontrado mais de uma vez");
            System.out.println("nas Posições/item: ");
            for (int i = 0; i < cont; i++) {
                System.out.println(pos[i]+" / "+item[pos[i]]);          //imprime todas as posições e o item encontrado na lista.
            }
            System.out.println("qual posição deseja remover: ");       
            Scanner retP = new Scanner(System.in);                     //ler a posição que deseja remover.
            int posi = retP.nextInt();
            remove(posi);
        }
        
    }
    //Algoritimo para retorna tamanho da lista
    public int size(){
        return this.tamanho;
    }
    
    public int length(){
        return ultimo;
    }
    
    //algoritimo para imprimir
    public void imprimir(){
        for (int i = 0; i < ultimo; i++) {
            System.out.println(item[i]);
            System.out.println("-----------");
           
        }
        System.out.println("==========Fim da exibição========");
        
    }
    
    //algoritimo para imprimir a lista a contrario
    public void imprimirReveso(){
        for (int i = ultimo-1; i >= 0; i--) {
            System.out.println(item[i]);
            System.out.println("--------------");
        }
        System.out.println("==========Fim da exibição========");
    } 
    
    @Override
    public String toString(){
         StringBuilder s = new StringBuilder();
        s.append("[");
        
        for (int i = 0; i < ultimo; i++) {
            if(item[i]!= null){
            s.append(item[i]);
            s.append(" ");
            }
        }
       
        s.append("]");
        
        return s.toString();
    }
}
