/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TorreHanoi;

/**
 *
 * @author Marking
 */
public class Hanoi {

    public Hanoi() {
    }
    
    private  void mover(String O, String D) {
		System.out.println(O + " -> " + D);
	}
    
    public void hanoi(int n, String origem, String destino, String aux) {

		if (n > 0) {
			hanoi(n - 1, origem, aux, destino);
			mover(origem, destino);
			hanoi(n-1,aux , destino, origem);
		}
    }
}
