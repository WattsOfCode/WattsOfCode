/**********************************************************************
 * Author: John Deardorff
 * Date: 07/22/2025
 * Assignment: SDC230 - Final Practical Exam
 * 
 * Main application(program) class
 * Description:
 * Class purpose for calling each method within the Unique class file.
 *  print header, obtain instance(s), and print instances
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        //print header
        System.out.println("John Deardorff - Final Practical Exam");
        System.out.println();
    
        // Obtain instance
        Unique uni = new Unique();
        uni.getNumbers(5);

        // Print instances
        uni.printUniqueNumbers();     
        uni.printMin();
        uni.printMax();
        uni.printSum();
        uni.printAvg();
        uni.printDiv();

        // Print statment last will be for spacing in terminal.
        System.out.println("All processing completed!");
        System.out.println();
    }
}