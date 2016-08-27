
package Trabalho1;

/**
 *
 * @author marking
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String turma;
    private float p1,p2,p3,nf;

    public Aluno (){
        
    }
    
    public Aluno(String nome, String matricula, String turma, float p1, float p2, float p3) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP3() {
        return p3;
    }

    public void setP3(float p3) {
        this.p3 = p3;
    }

    public float getNf() {
        return nf;
    }

    public void setNf(float nf) {
        this.nf = nf;
    }
    
    
    public float getNotaf(float nota1, float nota2, float nota3){
        this.nf = nota1 + nota2+nota3/3;
        return this.nf;
    }
    /*public float notaFinal(Aluno a, float nota1, float nota2, float nota3){
        float notaf;
        
        return notaf;
            
    }*/
    
    public void add(Aluno a){
        Aluno aluno = new Aluno();
       
    }
    
}
