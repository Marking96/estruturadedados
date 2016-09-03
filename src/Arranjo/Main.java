
package Arranjo;

import Trabalho1.Aluno;

/**
 *
 * @author marking
 */
public class Main {
    public static void main(String[] args) {
        String a = new String();
        String a1 = new String();
        String a2 = new String();
        String a3 = new String();
        
        ListaArranjo l = new ListaArranjo(10);
        
        a = "Atelus";
        a1 = "Brou";
        a2 = "Marcos";
        a3 = "Yuri";
        
        l.add(a);
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a);
        l.imprimi();
        
        //System.out.println("removido "+l.remove(a1));
        //l.imprimi();
        //
        //System.out.println("removido "+l.remove(2));
        //l.imprimi();
        
        l.removeplus(a);
    }
}
