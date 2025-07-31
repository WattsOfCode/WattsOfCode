
/********************************************************************************
 * Author: John Deardorff
 * Date: 07/16/2025
 * Assignment: SDC230 Week 4 PA Account Balance Calculations 
 *
 * Main application (program) class
 *  Include name, date, assignment, and class description
 * Print a line that states name and - Week 4 PA Account Balance Calculations
 * Ask user to Enter the starting balance
 * Ask user to Enter a credit or debit for the account
 * Continue asking the user to Enter credit or debit until the user enters a 0 (zero) to quit
 * If the debit would cause the account balance to be negative
 *      do not deduct the value from the account
 *      throw a user-defined exception stating the value would cause the account to go negative
 *      print the exception information
 * If the value is not a number 
 *      handle the InputMismatchException
 *      print the exception information
 *      print an error message
 * If the credit or debit is valid, update the account balance and pring the updated balance value
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("John Deardorff - Week 4 PA Account Balance Calculations");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true){
            try {                       
                System.out.print("Please provide your starting balance: ");
                balance = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Please enter a numeric value.");
                System.out.println();
                scanner.nextLine(); //clearing invalid input
            }
        }

        // try-catch block seaking a valid input
        while (true) {
            try {
                System.out.print("Please enter a credit or debit amount(0 to quit): ");
                double moneyValue = scanner.nextDouble();
                
                //check to exit program
                if (moneyValue == 0){
                    System.out.printf("The updated balance is: %.2f%n", balance);
                    break;
                } 
                // check if someone attempts to cause thier account to got negative
                if (moneyValue < 0 && balance + moneyValue < 0){
                    throw new Exception();
                }
                                
                //updating balance
                balance += moneyValue;
                System.out.printf("The updated balance is: %.2f%n", balance);
                System.out.println();

            } catch (InputMismatchException e) {
                System.out.println("Please enter a numeric value.");
                System.out.println();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Amount entered would cause account to become negative.");
                System.out.println();
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
