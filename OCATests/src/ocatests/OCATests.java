/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocatests;

/**
 *
 * @author makis
 */
public class OCATests {

    private String color;

    public OCATests() {
        this("White");
    }

    public OCATests(String color) {
       //εδώ χωρίς το this το color γινεται assign στον εαυτό του(!) οπότε δεν αλλάζει η τιμή του instance variable. 
        color = color;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        OCATests e = new OCATests("black");

        System.out.println("Color: " + e.color);

        String[][] strings = {{"Makis", "Stella"}, {"Efi"}, {"Giorgos", "Kwstas", "Dimitris"}, {"Kallirroi"}};
//
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[i].length; j++) {
//                System.out.print(strings[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (String[] s : strings) {
            for(String i : s){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*Post-increment operator
        java.util.List<String> names = new java.util.ArrayList<String>();
        
        names.add("Makis");
        names.add("Stella");
        
        for(int i=0; i<names.size(); i++)
        {
            String name = names.get(i);
            if(i>0)
            {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        
        for(int j=0; j<10;)
        {
            //infinite loop due to post
            j=j++;
            
            System.out.println("j= " + j);
        }
         */
 /*Exceptions
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException(" Hello! ");
        } catch (RuntimeException e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.print("d");
        }
        System.out.println("e");
         */
    }
}
