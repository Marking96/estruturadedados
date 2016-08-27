/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    
}
