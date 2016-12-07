
package Arvore;

import Arranjo.ListaArranjo;
import FilaArranjo.FilaArranjo;

/**
 *
 * @author Marking
 */
public class Arvore {
    public class No{
        String valor;
        ListaArranjo<No> filhas; //No[]
        
        
    }
    
    private No noRaiz;

    public Arvore(String valor) {
        this.noRaiz = new No();
        noRaiz.valor = valor;
    }
    
    public void inserir(String valor){
        No novo = new No();
        novo.filhas.add(novo);
    }
    
    public void excluir(String valor){
        if(noRaiz.filhas == null){
            noRaiz = null;
        }else{
            for (int i = 0; i < noRaiz.filhas.length(); i++) {
                if(noRaiz.filhas.getItem(i).valor == valor){
                    noRaiz.filhas.remove(noRaiz.filhas.getItem(i));
                }
            }
        }
    }
   
    public void show(){
        System.out.println(noRaiz.valor);
        noRaiz.filhas.imprimir();
    }
    
    
  //  public boolean buscaLargura(String valor){
  //      FilaArranjo fila = null;
  //      fila.enfileira(noRaiz);
  //      while(fila != null){
  //          No x = (No) fila.desenfileira();
  //          if(x.valor == valor){
  //              return true;
  //          }else{
  //              fila.enfileiratodos(x);
  //          }
  //      }
  //  } 
}
