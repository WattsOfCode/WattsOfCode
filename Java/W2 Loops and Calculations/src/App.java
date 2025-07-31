/*  Name: John Deardorff
    Date of Development: 2025-06-26
    Assignment: SDC230 Performance Assessment - Loops & Calculations
    Description: This class demonstrates the use of 
    counter-controlled and condition-based loops to perform calculations.
    Instructions:
    Incorporate the following requirements into your application:
•	The program will consist of one file - the main application class
        Name the class/file App.java
        Include documentation at the top of the file that includes
            Your name
            Date of development
            Assignment (e.g., SDC230 Performance Assessment - Loops & Calculations)
            Description of the class
	The main application class must meet the following requirements
        Print a line that states "Your Name - Week 2 PA Loops & Calculations"
        Demonstrate a counter-controlled loop
            Calculate the sum of the integers from 1 to 10
            Print the running total
            Print the final total 
        Demonstrate a condition-based loop
            Ask the user to enter an integer value (-1 to quit)
            Keep a running sum of the values
            Keep a count of how many values the user has entered
            Print the running total after each entry
            Print the final sum of all values entered
            Print a count of the values entered                                   
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("John Deardorff - Week 2 PA Loops & Calculations");
        System.out.println("");
        //COUNTER VALUE FOR COUNTER CONTROLLED LOOP 1
        int cnt = 1;            //initializing counter.
        int sum = 0;            //initializing sum.

        //COUNTER CONTROLLED LOOP 1
        System.out.println("Calculating the sum of integers 1 - 10: ");

        while (cnt <= 10) {
                sum = sum + cnt;
                cnt++;
                System.out.printf("Total so far: %d%n", sum);
        }
        //print final total 
        System.out.printf("Final Total: %d%n", sum);
        System.out.println("");

        //CONDITION BASED LOOP 2
        System.out.println("Adding integers entered:");

        //create scanner and int reset
        Scanner uInput = new Scanner(System.in);
        sum = 0;
        cnt = 0;

        // obtain user input
        System.out.print("Enter an integer value (-1 to stop): ");  
        int uVal = uInput.nextInt();
        while (uVal != -1 ) {     
            sum = uVal + sum;
            System.out.printf("Total so far: %d%n", sum);
            System.out.print("Enter a grade between 0 and 100 (-1 to stop): ");
            uVal = uInput.nextInt();
            cnt ++;         
        }
        //print final sum and count
        System.out.printf("Final Total: %d%n", sum);
        System.out.printf("Count of values entered: %d%n%n%n", + cnt);
        uInput.close();
    }
}
