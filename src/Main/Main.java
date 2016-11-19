package Main;

import Arranjo.ListaArranjo;
import BuscaBinaria.BuscaBinaria;
import Calculadora.Calculadora;
import CalculadoraPolonesa.CalculadoraPolonesa;
import Encadeada.ListaEncadeada;
import FilaArranjo.FilaArranjo;
import FilaEncadeada.FilaEncadeada;
import Inversão.Inversao;
import MdcRecursão.Mdc;
import Ordenação.HeapSort.HeapSort;
import Ordenação.InsertionSort.Insertion;
import Ordenação.MergeSort.MergeSort;
import Ordenação.QuickSort.QuickiSort;
import Ordenação.SelectionSort.Selection;
import Ordenação.ShellSort.Shell;
import PilhaArranjo.PilhaArranjo;
import PilhaEncadeada.PilhaEncadeada;
import ThreeSum.StopWhatch;
import ThreeSum.ThreeSum;
import TorreHanoi.Hanoi;
import testes.geradorNumeros;

/**
 *
 * @author marking
 */

public class Main {

    public static void main(String[] args) throws Exception {
        String a = "Atelus";
        String a1 = "Brou";
        String a2 = "Marcos";
        String a3 = "Yuri";
        int[] vetor = {250,500,1000,2000,4000,8000,16000};
        int [] v = new int[250];
        
        /*Teste Lista Arranjo
        ListaArranjo l = new ListaArranjo(6);
        l.add(a);
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.imprimir();
        l.remove(2);
        l.imprimir();
        System.out.println(l.length());
        System.out.println(l);
         */
 /*Teste Pilha Arranjo
        PilhaArranjo p = new PilhaArranjo(10);
        
        p.push(a);
        p.push(a1);
        p.push(a2);
        p.push(a3);
        p.pop();
        p.pop();
        p.imprimir();
        //System.out.println(p);
         */
 /*Teste fila Arranjo
        FilaArranjo fa = new FilaArranjo(2);
        fa.enfileira(a);
        fa.enfileira(a1);
        fa.enfileira(a2);
        fa.enfileira(a3);
        
        fa.imprimir();
        fa.desenfileira();
        System.out.println("Apos remover: ");
        fa.imprimir();
         System.out.println(fa);
         */
 /*Teste lista encadeada 
        ListaEncadeada l = new ListaEncadeada();
        int a4 = 1234;
        l.add(a);
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
         */
 /*Teste Fila encadeada
        FilaEncadeada f = new FilaEncadeada();
        
        f.enfileira(a);
        f.enfileira(a1);
        f.enfileira(a2);
        f.enfileira(a3);
        f.exibir();
        f.desenfileira();
        f.exibir();
         */
 /*Teste Pilha Encadeada
        PilhaEncadeada pe = new PilhaEncadeada();
        
        pe.push(a);
        pe.push(a1);
        pe.push(a2);
        pe.push(a3);
        pe.exibir();
        pe.pop();
        pe.exibir();
         */
 /*Teste Inverte Frase 
        String test = "O fortaleza empatou";
        Inversao i = new Inversao(test);
        i.inverte();*/
 /*teste calculadora polonesa 
       CalculadoraPolonesa c = new CalculadoraPolonesa();
       String exp = "224+*2/34";
       c.obterExpressao(exp);
         */
  /*teste calculadora polonesa
       Calculadora ca = new Calculadora();
       String exp = "(2+2)";
       ca.obterExpressao(exp);
         */
 /*Teste Analise
       ThreeSum sum = new ThreeSum(16000);
       sum.addLista();
       sum.calcula();
         */
/*MDC Recursivo
        Mdc m = new Mdc();
        System.out.println(m.calculaMdc(12, 6));

 */
/* BuscaBinaria 
        busca = new BuscaBinaria();
        System.out.println("Busca binaria: "+ busca.buscaBinaria(vetor,250, 0, vetor.length));*/
    
/*HAnoi
        Hanoi h = new Hanoi();
        h.hanoi(3, "torre 1", "torre 2", "torre 3");
    */
/*gera numeros aleatorios*/
        geradorNumeros g =new geradorNumeros(v);

        StopWhatch s = new StopWhatch();

/*HeapSort*/
        s.start();
        HeapSort h = new HeapSort(v);
        s.stop();
        System.out.println("Tempo: "+s.getElapsedTimeSecs());
        
        System.out.println("\nDepois de Ordenar: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print("-"+v[i]);
        }
    
/*InsetionSort
        Insertion i = new Insertion(v);
        System.out.println("\nDepois de Ordenar: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print("   -   "+v[j]); 
        }
    */
/*SelectionSort
        Selection s = new Selection(v);
        System.out.println("\nDepois de Ordenar: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print("   -   "+v[j]); 
        }
    */
/*ShellSort
        Shell sh = new Shell(v);
        System.out.println("\nDepois de Ordenar: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print("   -   "+v[j]); 
        }
    */
/*MergeSort        
        MergeSort m = new MergeSort(v);
        System.out.println("\nDepois de Ordenar: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print("   -   "+v[j]); 
        }
    */
/*QuickSort
     QuickiSort q = new QuickiSort(v);
        System.out.println("\nDepois de Ordenar: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print("   -   "+v[j]); 
        }
     */    
        System.out.println("");
    }
}
