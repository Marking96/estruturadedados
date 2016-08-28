
package Trabalho1;

/**
 *
 * @author marking
 */
public class Veiculos {
    //informações 
    
    private String marca;
    private String modelo;
    private int ano;
    private int numVIsita;
    private int capacidade;
    private int limiteTime;
    private String segmentacao;

    //operações
    
    public Veiculos() {
    }

    public Veiculos(String marca, String modelo, int ano, int numVIsita, int capacidade, int limiteTime) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numVIsita = numVIsita;
        this.capacidade = capacidade;
        this.limiteTime = limiteTime;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumVIsita() {
        return numVIsita;
    }

    public void setNumVIsita(int numVIsita) {
        this.numVIsita = numVIsita;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLimiteTime() {
        return limiteTime;
    }

    public void setLimiteTime(int limiteTime) {
        this.limiteTime = limiteTime;
    }

    public String getSegmentacao() {
        return segmentacao;
    }

    public void setSegmentacao(String segmentacao) {
        this.segmentacao = segmentacao;
    }
    
    
    
}
