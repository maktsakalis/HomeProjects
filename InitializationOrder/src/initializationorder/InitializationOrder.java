/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationorder;

/**
 *
 * @author makis
 */
public class InitializationOrder {

    /**
     * @param args the command line arguments
     */
    
    //#3 - instance variable
    private String name = "Torchie";

    //#3 - instance initializer
    {
        System.out.println(name);
    }

    //#2 - static variable
    private static int COUNT = 0;

    //#2 - static initializer
    static {
        System.out.println(COUNT);
    }

    //#3 - instance initializer
    {
        COUNT++;
        System.out.println(COUNT);
    }

    //#4 - constructor
    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("read to constructor");
        new InitializationOrder();
    }

}
