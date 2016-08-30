
package TadOlimpico;

/**
 *
 * @author marking
 */
public class TiroEsportivo {
    private String arma;
    private int distancia;
    private int tiros;
    private String modo;
    private Atleta atleta;

    public TiroEsportivo() {
        if(getModo() == "carabina"){
            if(getAtleta().getSexo() == 'm')
            {
              this.tiros = 40;
              
            }
        }
    }

    
    
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
    
    
    
}
