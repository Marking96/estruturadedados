
package Ordenação.SelectionSort;

/**
 *
 * @author Marking
 */
public class Selection {
    public Selection(int[] v){
        int n = v.length;
        for (int i = 0; i < n; i++) {
            int min =i;
            for (int j = i+1; j < n; j++) {
                if (less(v[j],v[min])) {
                    min = j;
                }
            }
            exch(v,i,min);
        }
    }
    
    private boolean less(int i,int j){
        return i<j;
    }
    private void exch(int[] a, int i,int j ){
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    
}
