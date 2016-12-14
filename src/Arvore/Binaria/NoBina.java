/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore.Binaria;

/**
 *
 * @author Marking
 */
public class NoBina {
    private int valor;
        private NoBina esquerda,direita;
        
        public NoBina() {
            
        }
        
        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public NoBina getEsquerda() {
            return esquerda;
        }

        public void setEsquerda(NoBina esquerda) {
            this.esquerda = esquerda;
        }

        public NoBina getDireita() {
                return direita;
        }

        public void setDireita(NoBina direita) {
            this.direita = direita;
        }
        

}
