
package Arranjo;

/**
 *
 * @author marking
 */
public class ListaArranjo {
    private int ultimo = 0;
    private int tamanho;
    Object item[];
    
    public ListaArranjo(int tamanho){
        this.tamanho = tamanho;
        this.item = new Object[this.tamanho];
    }
    
    public void add(Object o){
        if(ultimo < tamanho){
            item[ultimo] = o;
            ultimo++;
        }else{
            capacidade();
            item[ultimo] = o;
            ultimo++;
        }
        
    }
    
    public Object remove(Object o){
        Object aux = null;
        for (int i = 0; i < ultimo; i++) {
            if(o.equals(item[i])){
                aux = item[i];
                for (int j = i; j < ultimo; j++) {
                    item[j] = item[j+1];
                }
                item[ultimo-1] = null;
            }
        }
        ultimo = ultimo -1;
        return aux;
    }
    
    public boolean search(Object o){
        for (int i = 0; i < ultimo; i++) {
            if(o.equals(item[i])){
                return true;
            }   
        }
        return false;
        
    }
    
    public void capacidade(){
        Object aux[] = new Object[tamanho*2];
        for (int i = 0; i < ultimo; i++) {
            aux[i] = item[i];
        }
        item = aux;
    }
    
    public Object remove(int posicao){
        return remove(item[posicao]);
    }
    //Algoritimo improvisado 
    public void removeplus(Object o){
        int cont = 0;                               //Contador para quantas vezes o item tá na lista.
        int[] pos = new int[10];                    //array para armazena as posições
        for (int i = 0; i < ultimo; i++) {
            if (o.equals(item[i])) {                //procurando item.
                pos[cont] = i;                      //armazenando posições
                cont++;                             //imclementando o contador
            }
        }
        if (cont > 1) {                             //se o contador for maior que 1
            System.out.println("O mesmo item foi encontrado mais de uma vez");
            System.out.println("nas Posições: ");
            for (int i = 0; i < cont; i++) {
                System.out.print(pos[i]+" ");       //imprime todas as posições onde o item foi encontrado na lista.
            }
        }
        
    }
    
    public void imprimi(){
        for (int i = 0; i < ultimo; i++) {
            System.out.println(item[i]);
            System.out.println("-----------");
        }
    }
}
