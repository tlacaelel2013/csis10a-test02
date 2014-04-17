
/**
 * Write a description of class ReverseString here.
 * 
 * @author: Luis Acevedo-Arreguin 
 * @version: Apr 15, 2014
 */

import java.lang.String;

public class ReverseString
{
    public static void main(String[] args) {
        System.out.println(reverse1("Schlining"));
        System.out.println(reverse2("Schlining"));
        System.out.println(reverse3("Schlining"));
    }

    public static String reverse1(String s) {
        int pos = s.length();
        String New = "";
        while(pos > 0) {
            New = New + s.charAt(pos-1);
            pos -= 1;
        }
        return New;
    }

    public static String reverse2(String s) {
        int pos = s.length();
        String New = "";
        for(int i=0; i<pos; i++) {
            New = New + s.charAt(s.length()-i-1);
        }
        return New;
    }

    public static String reverse3(String s) {
        String New = "";
        while(s.length()>1) {
            
            char first = s.charAt(0);
            String rest = s.substring(1);
            if(rest.length()==1) {
                New = New + rest;
            }
            else {
                reverse3(rest);
            }
        }
        return New;
    }
}
