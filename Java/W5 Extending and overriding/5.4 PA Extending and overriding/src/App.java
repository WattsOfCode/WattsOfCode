/**************************************************************************
 * Author: John Deardorff
 * Date: 07/22/2025
 * Assignment: SDC230 - Week 5 PA - Extending & Overriding
 *
 * main class (program) class
 * In this application we will demonstrate inheritance
 * by instantiating Cat and Animal class objects and demonstrating 
 * use of superclass methods with subclass instances.
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        // Print a header line
        System.out.println("John Deardorff - Week 5 PA - Inheritance & Overriding");
        System.out.println();

        // Instantiate from the Cat and animal classes
        Animal a =  new Animal("Poptart", 0);
        Cat c = new Cat("Fluffy", 4, "Meow");

        //Print each object's properties
        a.printAnimal();
        c.printAnimal();

        a.setLegs(2);
        a.setName("Snowball");
        c.setLegs(40);
        c.setName("Wiggles");
        c.setSound("Squeak");

        a.printAnimal();
        c.printAnimal();

        System.out.println();
    }
}
