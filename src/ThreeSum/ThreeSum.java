
package ThreeSum;

import Arranjo.ListaArranjo;

/**
 *
 * @author Marking
 */
public class ThreeSum {
    private Integer[] l;
    private int tam;
    
    public ThreeSum(int tam) {
        this.l = new Integer[tam];
        
    }
    
    public void addLista(){
        for (int i = 0; i < l.length; i++) {
            l[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
        //calcula();
    }
    public void calcula(){
       
        int cont = 0;
        StopWhatch time = new StopWhatch();
        time.start();
        for (int i = 0; i < l.length; i++) {
            for (int j = i+1; j < l.length; j++) {
                for (int k = j+1; k < l.length; k++) {
                    if(l[i]+l[j]+l[k] == 0){
                        cont++;
                    }
                }
            }
        }
        System.out.println("tempo:  "+time.getElapsedTimeSecs()+" valor de cont: "+cont);
    }
}
