/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaBinaria;

/**
 *
 * @author Marking
 */
public class BuscaBinaria {

    public BuscaBinaria() {
    }
    
    public int buscaBinaria(int[] vetor,int item,int inicio,int fim){
        if(inicio> fim) 
            return -1;
        int meio = (inicio + fim)/2;
        
        if(item == vetor[meio]){
            return meio;
        }else if(vetor[meio]>item)
            return buscaBinaria(vetor, item, inicio, meio-1);
        else
            return buscaBinaria(vetor, item, meio+1, vetor.length);
        
    }
}
