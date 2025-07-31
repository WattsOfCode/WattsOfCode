/**************************************************************************
 * Author: John Deardorff
 * Date: 07/22/2025
 * Assignment: SDC230 - Week 5 PA - Extending & Overriding
 * 
 * Class Animal will be the superclass and will have the properties and methods described below
    Properties:
        Name - type String, represents the Animal's name
        Legs - type int, represents the number of legs the Animal has
    Constructor Parameters:
        name - type String
        legs - type int
    Functions
        getName - no parameters, return type String to get the Name property
        setName - parameter name - type String, no return, to set the Name property
        getLegs - no parameters, return type int to get the Legs property
        setLegs - parameter legs - type int, no return, to set the Legs property
        printAnimal - no parameters, no return, prints a formatted string of Animal 
        properties to the console
 */
public class Animal {
    // Class properties
    private String Name;
    private int Legs;

    // Constructor - note that the parameter Sound is used to call the 
    // superclass's constructor via keyword "super"
    public Animal(String name, int legs) {
        Name = name;
        Legs = legs;
    }
    // Create get and set methods
    public String getName() {
        return Name;
    }
    public int getLegs() {
        return Legs;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setLegs(int legs) {
        Legs = legs;
    }
    // Function to print the Animal's information
    public void printAnimal() {
        System.out.printf("The Animal's name is %s and it has %s legs.%n", Name, Legs);
    }
}
