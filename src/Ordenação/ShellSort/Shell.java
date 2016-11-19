
package Ordenação.ShellSort;

/**
 *
 * @author Marking
 */
public class Shell {
    public Shell(int[] v){
        int h = 1;
        int n = v.length;
        while(h < n){
            h = h * 3 +1;
        }
        h = h / 3;
        int c , j;
        while(h > 0){
            for (int i = h; i < n; i++) {
                c = v[i];
                j = i;
                while(j >= h && v[j-h]>c){
                    v[j] = v[j-h];
                    j = j - h;
                }
                v[j] = c;
            }
            h = h / 2;
        } 
    }
}
