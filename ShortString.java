
/**
 * Write a description of class ShortString here.
 * 
 * @author: Luis Acevedo-Arreguin 
 * @version: Apr 15, 2014
 */

import java.lang.String;

public class ShortString extends MyString
{
            
    public void display() {
        System.out.println(getString().charAt(0)+getString().charAt(getString().length()-1));
    }
}
