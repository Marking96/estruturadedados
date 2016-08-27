
package Trabalho1;

/**
 *
 * @author marking
 */
public class Lista {
    private Aluno[] alunos = new Aluno[100];
    
    public void add(Aluno a){
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] == null) alunos[i] = a;
        }
    }
    
    public float calculaNotaF(String turma){
        float nft = 0;
        int j = 0;
        for (int i = 0; i < alunos.length; i++) {
            if(turma.equals(alunos[i].getTurma())){
                float aux = alunos[i].getNf();
                nft = nft+aux;
                j++;
            }
            nft= nft/j;
            return nft;
        }
        return 0;
    }
    
}
