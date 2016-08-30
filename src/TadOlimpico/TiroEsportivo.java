
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
    
    

    /*public TiroEsportivo(String arma,String modo,Atleta a) {
        if(arma.equals(getArma()) && modo.equals(getModo())){
            this.distancia = 50;
            if(getAtleta().getSexo() == 'm')
            {
              this.tiros = 40;
               
            }else{
                this.tiros = 20;
            }
        }else if()
        
    }*/
 
    public TiroEsportivo(String arma, String modo, Atleta atleta) {
        this.arma = arma;
        this.modo = modo;
        this.atleta = atleta;
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
    
    public void cadastroPart(){
        if("carabina".equals(getArma())){ 
            if("três posições".equals(getModo())){
                this.distancia = 50;
                if(getAtleta().getSexo() == 'm')
                {
                    this.tiros = 40;
               
                }else{
                    this.tiros = 20;
                }
            }else if("pequeno calible".equals(getModo())){
                this.tiros = 60;
                
            }else if("carabina de ar".equals(getModo())){
                if(getAtleta().getSexo() == 'm')
                {
                    this.tiros = 60;
               
                }else{
                    this.tiros = 40;
                }
            }
            
        }
    }
    
    public void imprimir(){
        System.out.println("Modo: "+getModo());
        System.out.println("Arma: "+getArma());
        System.out.println("");
    }
}
