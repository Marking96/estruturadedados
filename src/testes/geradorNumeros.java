/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Marking
 */
public class geradorNumeros {
    private int[] l;
 
    public geradorNumeros(int[] l) {
        this.l = l;
        addLista();
    }
    
    
    private void addLista(){
        for (int i = 0; i < l.length; i++) {
            l[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
        
    }
}
