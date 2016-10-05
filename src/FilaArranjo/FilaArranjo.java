package FilaArranjo;

/**
 *
 * @author Marking
 */
/*Pilha Arranjo ultiliçabdo uma pilha circula*/
public class FilaArranjo<E> {

    E[] item;
    private int tamanho;
    private int frente = 0;
    private int tras = 0;

    public FilaArranjo(int tamanho) {
        this.item = (E[]) new Object[tamanho];
        this.tamanho = tamanho;
    }

    public void enfileira(E o) {
        if ((tras + 1) % tamanho == frente) {
            redimencionar();
            item[tras] = o;
            tras = (tras + 1) % tamanho;
        } else {
            item[tras] = o;
            tras = (tras + 1) % tamanho;
        }
    }

    public E desenfileira() {
        E aux = null;
        if (vazio()) {
            return null;
        }
        aux = item[frente];
        item[frente] = null;
        frente = (frente + 1) % tamanho;
        if(tras == tamanho/2){
            reduzirCapacidade();
        }
        return aux;
    }

    public boolean vazio() {
        return frente == tras;
    }

    public boolean cheia() {
        return (tras + 1) % tamanho == frente;
    }

    public int nrElementos() {
        if (tras < frente) {
            return tamanho - (frente - tras);
        } else if (tras > frente) {
            return tras - frente;
        }
        return -1;
    }

    private void redimencionar() {
        E novoItem[] = (E[]) new Object[2 * tamanho];
        for (int i = 0; i < nrElementos(); i++) {
            novoItem[i] = item[(frente + i) % tamanho];
        }
        item = novoItem;
        frente = 0;
        tras = nrElementos();
        tamanho = tamanho * 2;
    }

    private void reduzirCapacidade() {
        this.tamanho = (int) (tamanho * 0.75);

    }

    public void imprimir() {
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                System.out.println("-" + item[i]);
            }
        }
        System.out.println("--------------------");
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for (int i = 0; i < nrElementos(); i++) {
            if (item[i] != null) {
            s.append(item[i]);
            s.append(" , ");
            }
        }
        if (nrElementos()>0) {
            s.append(item[(nrElementos())]); 
        }
        s.append("]");
        
        return s.toString();
    }
}
