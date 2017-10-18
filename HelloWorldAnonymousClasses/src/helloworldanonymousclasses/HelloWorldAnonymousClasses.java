/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldanonymousclasses;

/**
 *
 * @author makis
 */



/*abstract class or*/ interface HelloWorld {

    /*abstract*/ public void greet();

    /*abstract*/ public void greetSomeone(String someone);
}




public class HelloWorldAnonymousClasses {

    public void sayHello() {
        

        //Local inner class (class inside a method)
        class EnglishGreeting /*extends or*/ implements HelloWorld {

            String name = "world";

            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        EnglishGreeting englishGreeting = new EnglishGreeting();

        //Anonymous inner class
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        //Anonymous inner class
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp
                = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}
