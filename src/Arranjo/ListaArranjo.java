
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
    
    public boolean add(Object o){
        if(ultimo < tamanho){
            item[ultimo] = o;
            ultimo++;
            return true;
        }
        return false;
    }
    public Object remove(Object o){
        Object aux = null;
        for (int i = 0; i < ultimo; i++) {
            if(item[i].equals(o)){
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
}
