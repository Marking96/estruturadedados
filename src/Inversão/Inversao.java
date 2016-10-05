/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inversão;

import PilhaArranjo.PilhaArranjo;
import java.util.StringTokenizer;

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
       //StringTokenizer token = new StringTokenizer(text, " ");
       fr=text.split(" ");
        for (int i = fr.length-1; i > -1; i--) {
            if(fr[i] != null){
                 p1.push(fr[i]);
            }
           
        }
        
        System.out.println(p1);
    }
  
}
    
    

