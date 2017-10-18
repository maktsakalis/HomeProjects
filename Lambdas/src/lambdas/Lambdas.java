/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author makis
 */
public class Lambdas {

    public static void main(String[] args) {
        // TODO code application logic here

        List<Animal> list = new ArrayList<>();

        list.add(new Animal("fish", false, true));
        list.add(new Animal("kangaroo", true, false));
        list.add(new Animal("rabbit", true, false));
        list.add(new Animal("turtle", false, true));

        print(list, new CheckIfHopper());
        print(list, a -> a.canSwim());
    }

    //static print() method that is called inside static main()
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal a : animals) {
            if (checker.test(a)) {
                System.out.print(a + " ");
            }
        }
        System.out.println();

    }
}
