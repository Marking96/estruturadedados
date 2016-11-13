
package Ordenação.HeapSort;

/**
 *
 * @author Marking
 */
public class HeapSort {

    public HeapSort(int v[]) {
        construirMaxHeap(v);
        int n = v.length;
        
        for (int i = v.length-1; i > 0; i--) {
            swap(v,i,0);
            maxHeapify(v,0, --n);
        }
    }
    
    private void construirMaxHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--)
            maxHeapify(v, i, v.length);

    }
    
    private void maxHeapify(int[] v,int pos, int tamanhovetor){
        int max = 2* pos +1, direita = max +1;
        if(max < tamanhovetor){
            if(direita < tamanhovetor && v[max] < v[direita])
                max = direita;
            if(v[max] > v[pos]){
                swap(v,max,pos);
                maxHeapify(v, max, tamanhovetor);
            }
        }
    }
    
    public void swap(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
    
    
}
