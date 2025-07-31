/*  Name: John Deardorff
    Date: 06/27/2024
    Assignment: SDC230 Performance Assessment - Smallest Number
    Description: In this class we will create an application that demonstrates the 
    use of a loop to determine the smallest value entered by the user.

    Incorporating the following requirements into application:
    The program will consist of one file - the main application class   
        Name the class/file App.java
        Include documentation at the top of the file that includes
            *Your name
            *Date of development
            *Assignment (e.g., SDC230 Performance Assessment - Smallest Number)
            *Description of the class
    The main application class must meet the following requirements
        *Print a line that states "Your Name - Week 2 PA Smallest Number"
        *Ask the user how many integers they will enter
        Loop to get the specified number of integers from the user
        Print the value of the smallest integer entered by the user  */

//Grabbing imports
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Create title
        System.out.println("\nJohn Deardorff - Week 2 PA Smallest Number");
        System.out.println("");

        //Create Scanner
        Scanner scan = new Scanner(System.in);

        // Initialize smallest to the largest possible integer value
        int smallest = Integer.MAX_VALUE;
        boolean checker = false;

        // input count from user input running the loop based on value of count
        while (checker == false) {
            try{
                System.out.print("How many integers would you like to enter: ");

                if (scan.hasNextInt()) {
                    // get user desired number
                    int count = scan.nextInt();
                    System.out.println("");

                    // check for valid greater or equal to 0 value otherwise throws error.
                    if (count > 0) {                          
                        
                        // if passes changes the while to true
                        checker = true;

                        // counts down from user number.
                        for (int i = count; i >= 1; i--) {
                            System.out.print("Enter an integer value: ");
                            int uVal = scan.nextInt();

                            // calculate the smallest value
                            if (uVal < smallest) {
                                smallest = uVal;
                            }
                        }
                    } else {
                        throw new Exception();
                    }
                    System.out.printf("%nThe smallest value entered is: %d%n%n", smallest);
                    scan.close(); 
                    break;
                }
            } catch (Exception e){
                System.err.printf("%s: Not proper integer. %n", e);
                scan.nextLine();
            }
        }
    }
}
