
package CalculadoraPolonesa;

import PilhaArranjo.PilhaArranjo;
import PilhaEncadeada.PilhaEncadeada;

/**
 *
 * @author Marking
 */
public class CalculadoraPolonesa<E> {
    
    private PilhaEncadeada<Integer> numeros;
    private PilhaEncadeada<Character> operacoes;

    public CalculadoraPolonesa() {
        this.numeros = new PilhaEncadeada<>();
        this.operacoes = new PilhaEncadeada<>();
    }
    
    public void obterExpressao(String expressao) throws Exception{
        for (int i = expressao.length()-1; i >= 0 ; i--) {
            switch(expressao.charAt(i)){
              /*Operadores*/
                case'0':
                    numeros.push(0);
                    break;
                case'1':
                    numeros.push(1);
                    break;
                case'2':
                    numeros.push(2);
                    break;
                case'3':
                    numeros.push(3);
                    break; 
                case'4':
                    numeros.push(4);
                    break;
                case'5':
                    numeros.push(5);
                    break;
                case'6':
                    numeros.push(6);
                    break;
                case'7':
                    numeros.push(7);
                    break;
                case'8':
                    numeros.push(8);
                    break;
                case'9':
                    numeros.push(9);
                    break;
            /*Operadores*/
                   case'+':
                    operacoes.push(expressao.charAt(i));
                    break; 
                   case'-':
                    operacoes.push(expressao.charAt(i)); 
                    break;
                   case'*':
                    operacoes.push(expressao.charAt(i));
                    break;
                   case'/':
                    operacoes.push(expressao.charAt(i));
                    break;
            }
        }
        //numeros.exibir();
        //operacoes.exibir();
        try{
            if(operacoes.size()+2 == numeros.size()){
                throw new Exception("Erro quantidade de numeros maior que a de operadores! Expressão Invalida");
            }else{
                while(operacoes.size() != 0 && numeros.size()!= 1){
                    Character operadores = operacoes.pop();
                    Integer numero1 = numeros.pop();
                    Integer numero2 = numeros.pop();
           
                    numeros.push(calculo(operadores, numero1, numero2));
            
                }
                numeros.exibir();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public int calculo(Character ope,Integer num1,Integer num2) throws Exception{
        if(ope == '+'){
            return num1+num2;
        }
        else if(ope == '-'){
            return num1 - num2;
        }
        else if(ope == '*'){
            return num1 * num2;
        }
        else{
            if(num2 != 0){
                return num1 / num2;
            }else{
                throw new Exception("Erro Divição por zero!");
            } 
        }
      
    }
}
