
package TadOlimpico;

/**
 *
 * @author marking
 */
public class Main {
    public static void main(String[] args) {
         Atleta a1 = new Atleta();
        TiroEsportivo t = new TiroEsportivo();
        
        a1.setNome("Algusto");
        a1.setSexo('m');
        
        t.setModo("três posições");
        t.setArma("carabina");
        t.setAtleta(a1);
        t.cadastroPart();
        t.imprimir();
    }
    
    
}
