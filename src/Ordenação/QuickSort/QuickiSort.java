
package Ordenação.QuickSort;

/**
 *
 * @author Marking
 */
public class QuickiSort {

    public QuickiSort(int[] v) {
        quickSort(v, 0 , v.length-1);
    }

    private void quickSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = separa(v, inicio , fim);
            quickSort(v, inicio, pivo-1);
            quickSort(v, pivo+1, fim);
        }
    }

    private int separa(int[] v, int inicio, int fim) {
        int pivo = v[inicio];
        int i = inicio + 1,f = fim;
        while (i <= f) {            
            if (v[i] <= pivo) {
                i++;
            }else if (pivo < v[f]) {
                f--;
            }
            else{
                int troca = v[i];
                v[i] = v[f];
                v[f] = troca;
                i++;
                f--;
            }
        }
        v[inicio] = v[f];
        v[f] = pivo;
        return f;
    }
    
    
}
