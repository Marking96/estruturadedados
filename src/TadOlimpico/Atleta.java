
package TadOlimpico;

/**
 *
 * @author marking
 */
public class Atleta {
    private String Nome;
    private String delegacao;
    private char sexo;
    private int pontuacao;

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Atleta() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDelegacao() {
        return delegacao;
    }

    public void setDelegacao(String delegacao) {
        this.delegacao = delegacao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
