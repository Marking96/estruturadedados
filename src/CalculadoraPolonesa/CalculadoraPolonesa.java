
package CalculadoraPolonesa;

import PilhaArranjo.PilhaArranjo;

/**
 *
 * @author Marking
 */
public class CalculadoraPolonesa<E> {
    
    private PilhaArranjo<Integer> numeros;
    private PilhaArranjo<Character> operações;

    public CalculadoraPolonesa() {
        this.numeros = new PilhaArranjo<>();
        this.operações = new PilhaArranjo<>();
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
                    operações.push(expressao.charAt(i));
                    break; 
                   case'-':
                    operações.push(expressao.charAt(i));
                    break;
                   case'*':
                    operações.push(expressao.charAt(i));
                    break;
                   case'/':
                    operações.push(expressao.charAt(i));
                    break;
            }
        }
        while(operações.length() != 0 && numeros.length()!= 1){
            Character opradores = operações.pop();
            Integer numero1 = numeros.pop();
            Integer numero2 = numeros.pop();
            
            numeros.push(calculo(opradores, numero1, numero2));
            
        } 
        System.out.println(numeros);
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
