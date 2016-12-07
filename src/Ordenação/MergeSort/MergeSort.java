
package Ordenação.MergeSort;

/**
 *
 * @author Marking
 */
public class MergeSort {

    public MergeSort( int[] v) {
        int[] aux = new int[v.length];
        sort(v, aux , 0 , v.length-1);
    }
    
    private void sort(int[] v, int[] aux, int inicio, int fim){
        if (inicio < fim) {
            int meio = (fim+inicio)/2;
            sort(v, aux, inicio, meio);
            sort(v, aux, meio+1, fim);
            merge(v, aux, inicio,meio, fim);
        }
    }

    private void merge(int[] v, int[] aux, int inicio, int meio, int fim) {
        //issorted
        for (int k = inicio; k <= fim; k++) {
            aux[k] = v[k];
        }
        int i = inicio;
        int j = meio+1;
        for (int k = inicio; k <= fim; k++) {
            if (i>meio) {
                v[k] = aux[j++];
            }else if (j>fim) {
                v[k] = aux[i++];
            }else if (aux[j] < aux[i]) {
                v[k] = aux[j++];
            }else{
                v[k] = aux[i++];
            }
        }
    }
   
}
