/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringisimmutable;

/**
 *
 * @author makis
 */
public class StringIsImmutable {

    /**
     * @param args the command line arguments
     */
    
    int count;
    
    public static void main(String[] args) {
        // TODO code application logic here

        String a = "abcd";
        String b = a.toUpperCase();
        
        //this will not change a string since strings are immutable
        a.replace("B", "2").replace('C', '3');
        
        //from now on b string will reference to the new string
        b = b.replace("B", "2").replace('C', '3');

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    
        StringBuilder c = new StringBuilder("abc");
        
        StringBuilder d = c.append("de");
         d = d.append("f").append("g");
         
         System.out.println("c = " + c);
         System.out.println("d = " + d);        
    }

}
