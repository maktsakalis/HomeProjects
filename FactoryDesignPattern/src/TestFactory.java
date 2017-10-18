
import factorydesignpattern.FactoryDesignPattern;
import factorydesignpattern.SomeInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author makis
 */
public class TestFactory {
    
    
    public static void main(String... args){
    
    FactoryDesignPattern factory = new FactoryDesignPattern();
    
    SomeInterface shape = factory.getShape("CIRCLE");
    shape.draw();
    
    SomeInterface shape2 = factory.getShape("rectangle");
    shape2.draw();
    
    SomeInterface shape3 = factory.getShape("square");
    shape3.draw();
    }
}
