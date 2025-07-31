/*****************************************************************************
 * Author: John Deardorff
 * Date: 07/17/2025
 * Assignment: SDC230 | Week 4 PA User Entry of Age
 * 
 * Discription: 
 * Main application (program) class
 * 
 * The program will consist of one file - the main application class
    Name the class/file App.java
    Include documentation at the top of the file that includes
        name, Date, Assignment, Description
    The main application class must meet the following requirements
        Print a line that states "Your Name - Week 4 PA User Entry of Age"
        Ask the user to enter their age
        If the age is between 1 and 100
            print a message stating the age the user entered
            exit the program
        If the age is less than 1 or greater than 100
            generate an InputMismatchException
            print the exception information
            print an error message
        If the value is not an integer
            generate an InputMismatchException
            print the exception information
            print an error message
        Continue asking the user to enter their age until a valid age is entered
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("John Deardorff - Week 4 PA User Entry of Age");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        // try-catch block
        while (true) {
            try {
                System.out.print("Please enter your age: ");
                age = scanner.nextInt();

                if (age >= 1 && age <= 100) {
                    System.out.println();
                    System.out.printf("The age entered is: %d%n", age);
                    break;
                } else {
                    System.out.println("Please enter an integer in range 1 - 100.");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer in range 1 - 100.");
                System.out.println();
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
