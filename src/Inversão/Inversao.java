
package Inversão;

import PilhaArranjo.PilhaArranjo;


/**
 *
 * @author Marking
 */
public class Inversao{
    String text;
    String[] fr; 
    PilhaArranjo p1;

    public Inversao(String text) {
        this.text = text;
        this.p1 = new PilhaArranjo(10);
        this.fr = new String[10];
    }
    
    public void inverte(){
       
       fr=text.split(" ");
        for (int i = fr.length-1; i > -1; i--) {
            if(fr[i] != null){
                 p1.push(fr[i]);
            }
           
        }
        
        System.out.println(p1);
    }
  
}
    
    

