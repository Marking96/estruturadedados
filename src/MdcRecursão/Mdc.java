
package MdcRecursão;

/**
 *
 * @author Marking
 */
public class Mdc {

    public Mdc() {

    }

    public int calculaMdc(int a, int b) {
        if (a <= b || a % b == 0) {
            return b;
        } else if (a < b) 
                return calculaMdc(a, b);
        else 
            return calculaMdc(b, a % b);
    }

}
