
package Trabalho1;

/**
 *
 * @author marking
 */
public class Produto {
    private int codigo;
    private String nome;
    private int quantEstoque;
    private float preco;
    //Adicionado
    private String tipo;

    public Produto(int codigo, String nome, int quantEstoque, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float atribuirDesc(float desconto){
        desconto = desconto - getPreco();
        return desconto;
    }
    
    public boolean emEstoque(Produto p){
        if(p.getQuantEstoque() > 0){
            return true;
        }
        return false;
    }
}
