
package MdcRecursão;

/**
 *
 * @author Marking
 */
public class Mdc {

    public Mdc() {

    }

    public int calculaMdc(int a, int b) {
        if (b>a) {
            return calculaMdc(b, a);
        }
        if(b == 0){
            return  a;
        }
        else 
            return calculaMdc(b, a % b);
    }

}
