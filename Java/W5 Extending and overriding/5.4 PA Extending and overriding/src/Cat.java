/**************************************************************************
 * Author: John Deardorff
 * Date: 07/22/2025
 * Assignment: SDC230 - Week 5 PA - Extending & Overriding
 * Class Cat will extend Animal and will have the properties and methods described below
    Properties:
        Sound - type String, represents the sound the Cat is making
    Constructor Parameters:
        name - type String
        legs - type int
        sound - type String
    Functions
        getSound - no parameters, return type String to get the Sound property
        setSound - parameter sound - type String, no return, to set the Sound property
        printAnimal - Override of the superclass function; no parameters, no return, 
        prints a formatted string of Cat properties to the console
 */
public class Cat extends Animal{
    //Class property
    private String Sound;

    // Constructor - note that the parameter sound is used to cal the 
    // superclass's constructor via the keyword "super" 
    public Cat(String name, int legs, String sound) {
        super(name, legs);
        Sound = sound;
    }
    // Setting up get and set methods
    public String getSound() {
        return Sound;
    }
    public void setSound(String sound) {
        Sound = sound;
    }
    //Function to print the Cat's infromation
    @Override
    public void printAnimal() {
        // Printing the cat's information - use the superclass function
        // "getSound" to print the inherited Sound information.
        System.out.printf(
            "The Cat's name is %s, it has %s legs and is making a %s sound.%n", 
            getName(), getLegs(), getSound());
    }
}
