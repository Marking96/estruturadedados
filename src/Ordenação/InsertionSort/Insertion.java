
package Ordenação.InsertionSort;

/**
 *
 * @author Marking
 */
public class Insertion {
    
    public Insertion(int[] v){
        int n = v.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(v[j],v[j-1])) {
                    exch(v,j,j-1);
                }
                else break;
            }
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
