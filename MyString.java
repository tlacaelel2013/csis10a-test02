
/**
 * Write a description of class MyString here.
 * 
 * @author: Brian Schlining 
 * @version: Apr 15, 2014)
 */
public class MyString
{
    private String s;
    
    public MyString(String s) {
        this.s = s;
    }

    public String getString() {
        return s;
    }

    public void display() {
        System.out.println(getString());
    }
}
