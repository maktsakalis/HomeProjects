/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythreads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author makis
 */
public class MyThreads implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyThreads test = new MyThreads();
        Thread t = new Thread(test);

        t.start();
        try {
            t.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("This is the main thread!");
    }

    @Override
    public void run() {
        System.out.println("This is the test thread!");
    }

}
