package Arvore.Binaria;

import FilaEncadeada.FilaEncadeada;
import PilhaEncadeada.PilhaEncadeada;

/**
 *
 * @author Marking
 */
public class ArvoreBinaria {

    public class No {

    }
    

    public ArvoreBinaria() {
    }

    public NoBina criarAvore(int valor) {
        NoBina no = new NoBina();
        no.setValor(valor);
        no.setEsquerda(null);
        no.setDireita(null);
        return no;
    }

    public void inserirEsquerdo(NoBina subArv, NoBina no) {
        if (subArv.getEsquerda() != null) {
            System.out.println("Erro");
        } else {
            subArv.setEsquerda(no);

        }
    }

    public void inserDireta(NoBina subArv, NoBina no) {
        if (subArv.getDireita() != null) {
            System.out.println("Erro");
        } else {
            subArv.setDireita(no);

        }
    }

    public NoBina removeEsquerda(NoBina no) {
        if (no.getEsquerda() != null) {
            NoBina aux = no.getEsquerda();
            if (aux.getEsquerda() != null) {
                no.setEsquerda(aux.getEsquerda());
                return aux;
            } else {
                no.setEsquerda(null);
                return aux;
            }
        } else {
            System.out.println("esse no não tem filho esquerdo!");
            return null;
        }
    }

    public NoBina removeDireta(NoBina no) {
        if (no.getDireita() != null) {
            NoBina aux = no.getDireita();
            if (aux.getDireita() != null) {
                no.setDireita(aux.getDireita());
                return aux;
            } else {
                no.setDireita(null);
                return aux;
            }
        } else {
            System.out.println("esse no não tem filho direito!");
            return null;
        }
    }

    public void show(NoBina r) {
        if (r == null) {
            System.out.println("Arvore vazia");
        } else {
            prefixa(r);
        }
    }

    private void prefixa(NoBina no) {
        if (no != null) {

            prefixa(no.getEsquerda());
            System.out.print(no.getValor() + ",");
            prefixa(no.getDireita());
        }
    }
    
    //busca em largura apartoi de um dado nó
    public boolean buscaLargura(NoBina r,int valor){
        FilaEncadeada fila = new FilaEncadeada();
        fila.enfileira(r);
        while(!fila.isEmpty()){
            NoBina x = (NoBina) fila.desenfileira();
            if(x.getValor() == valor){
                return true;
            }else{
                if(x.getDireita() != null){
                    fila.enfileira(x.getDireita());
                }else if(x.getEsquerda() != null){
                    fila.enfileira(x.getEsquerda());
                }
            }
        }
        return false;
    }
    
    //busca em profundidade apartoi de um dado nó
    public boolean buscaProfundidade(NoBina r,int valor){
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.push(r);
        while(!pilha.isEmpty()){
            NoBina x = (NoBina) pilha.pop();
            if(x.getValor() == valor){
                return true;
            }else{
                if(x.getDireita() != null){
                    pilha.push(x.getDireita());
                }else if(x.getEsquerda() != null){
                    pilha.push(x.getEsquerda());
                }
            }
        }
        return false;
    }
}
