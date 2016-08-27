
package Trabalho1;

/**
 *
 * @author marking
 */
public class teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Lista lista = new Lista();
        
        a1.setNome("Marcelo");
        a1.setP1((float) 5.4);
        a1.setP2((float) 7.05);
        a1.setP3((float) 4.5);
        a1.setTurma("B");
        a1.notafinal();
        
        a2.setNome("Carlos");
        a2.setP1(5);
        a2.setP2(7);
        a2.setP3(4);
        a2.setTurma("B");
        a1.notafinal();
       
        
        lista.add(a1);
        lista.add(a2);
        
        System.out.println(lista.calculaNotaF("B"));
    }
}
