
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
    
    private void sort(int[] v, int[] aux, int low, int hi){
        if (low < hi) {
            int meio = (hi+low)/2;
            sort(v, aux, low, meio);
            sort(v, aux, meio+1, hi);
            merge(v, aux, low,meio, hi);
        }
    }

    private void merge(int[] v, int[] aux, int low, int meio, int hi) {
        //issorted
        for (int k = low; k <= hi; k++) {
            aux[k] = v[k];
        }
        int i = low;
        int j = meio+1;
        for (int k = low; k <= hi; k++) {
            if (i>meio) {
                v[k] = aux[j++];
            }else if (j>hi) {
                v[k] = aux[i++];
            }else if (aux[j] < aux[i]) {
                v[k] = aux[j++];
            }else{
                v[k] = aux[i++];
            }
        }
    }
   
}
