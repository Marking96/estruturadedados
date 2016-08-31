
package TadOlimpico;

/**
 *
 * @author marking
 */
public class Partidas {
    int tamanho = 100;
    int ultimo = 0;
    TiroEsportivo[] tiro = new TiroEsportivo[tamanho];
    //Atleta at = new Atleta();
    
    public void addPartida(TiroEsportivo t){
        if(ultimo<tamanho){
            tiro[ultimo] = t;
        }
        ultimo++;
        
    }
    
    public void cadastroPart(String arma,String modo,Atleta a){
        for (int i = 0; i < tamanho; i++) {
            if(arma.equals(tiro[i].getArma())){ 
                if(modo.equals(tiro[i].getModo())){
                    tiro[i].setDistancia(50);
                    if(a.getSexo()== 'm'){
                        tiro[i].setTiros(40);
               
                    }else{
                        tiro[i].setTiros(20);
                    }
                }else if(modo.equals(tiro[i].getModo())){
                   tiro[i].setTiros(60);
                
                }else if(modo.equals(tiro[i].getModo())){
                    if(a.getSexo() == 'm'){
                        tiro[i].setTiros(60);
                    }else{
                    tiro[i].setTiros(40);
                    }
                }
            }
            tiro[i].setAtleta(a);
        }
    }
    
    public void imprimir(){
        for (TiroEsportivo tiro1 : tiro) {
            System.out.println("Modo: " + tiro1.getModo());
            System.out.println("Arma: " + tiro1.getArma());
            System.out.println("Distancia: " + tiro1.getDistancia());
            System.out.println("Alteta: " + tiro1.getAtleta().getNome());
            System.out.println("--------------------");
        }
    }

}
