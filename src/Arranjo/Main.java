
package Arranjo;



/**
 *
 * @author marking
 */
public class Main {
    public static void main(String[] args) {
        String a;
        String a1;
        String a2;
        String a3;
        
        ListaArranjo l = new ListaArranjo(6);
        
        a = "Atelus";
        a1 = "Brou";
        a2 = "Marcos";
        a3 = "Yuri";
        
        l.add(a);
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a);
        l.add(a2);
        //l.imprimi();
        System.out.println(l.size());
         
        //l.remove(0);
        
        l.imprimi();
        
        l.remove(a);
        l.remove(a1);
        l.remove(a2);
        
        System.out.println(l.size());
        /*System.out.println("removido "+l.remove(a1));
        */
        //l.imprimi();
        /*
        
        System.out.println("removido "+l.remove(2));
        l.imprimi();
        
        l.removeplus(a);
        */
    }
}
