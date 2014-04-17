
/**
 * Write a description of class VectorNorm here.
 * 
 * @author: Luis Acevedo-Arreguin
 * @version: Apr 15, 2014
 */

//import java.lang.Math;

public class VectorNorm
{

    public static void main(String[] args) {
        System.out.println("norm(2,3,4) = " + norm(2, 3, 4));
    }

    public static double norm (double x, double y, double z) {
        return Math.sqrt(x*x + y*y + z*z);
    }
}
