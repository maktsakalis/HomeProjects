package factorydesignpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author makis
 */
public class Circle implements SomeInterface {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}