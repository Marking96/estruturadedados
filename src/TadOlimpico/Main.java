
package TadOlimpico;

/**
 *
 * @author marking
 */
public class Main {
    public static void main(String[] args) {
         Atleta a1 = new Atleta();
        TiroEsportivo t = new TiroEsportivo();
        Partidas p = new Partidas();
        
       a1.setNome("Aeosvaldo");
       a1.setSexo('m');
       t.setAtleta(a1);
       t.setArma("carabina");
       t.setModo("pequeno calible");
       p.addPartida(t);
       
       
       p.cadastroPart("carabina", "pequeno calible", a1);
       
       p.imprimir();
       
    }
    
    
}
