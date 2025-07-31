/*****************************************************************
 * Name: John Deardorff
 * Date: 07/10/2025
 * Assignment: SDC 230 | Week 3 PA Calculations & Unique Numbers
 * 
 * Application Requirments
 * Program will consist of one file - the main class with the following
 *      Name, Date of document, Assignment details, and Description of class
 * The main application must meet the following requirements
 * +   Print a line that states 
 *          "John Deardorff - week 3 PA Calculations & Unique Numbers"
 *     get 10 integers values from the user and store them in an array
 *     store the unique number in an ArrayList 
 *          Hint: use the arraylist "contains" method to see 
 *              if the value is alread in the ArrayList
 *          This can be done while gathering the values from the user or after 
 *              all values are in the array
 *     Write a method to calculate the total (sum) of all elements is an
 *          ArrayList
 *     Display the following  information for both the array and the ArrayList objects
 *          Count of elements in the collection
 *          Sum of all elements in the collection
 *          Average of values in the collection
 */
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // print with system title and name
        System.out.println();
        System.out.println("John Deardorff - Week 3 PA Calculations with unique numbers");
        System.out.println();

        //set array size
        int setNum = 10;
        int[] numArr = getNumbers(setNum);

        // Store unique numbers in ArrayList
        ArrayList<Integer> numList = new ArrayList<>();
        for (int num : numArr) {
            if (!numList.contains(num)) {
                numList.add(num);
            }
        }
        // calculate arrays sums and avgs
        int sum = sumNum(numArr);
        double avg = avgNum(numArr);
        int uniqueSum = sumNum(numList);
        double uniqueAvg = avgNum(numList);

        // Displaying results of arrays
        System.out.printf("%nThe count of integers entered is: %d%n", numArr.length);
        System.out.printf("The sum of integers entered is: %d%n", sum);
        System.out.printf("The average of integers entered is: %.2f%n", avg);

        System.out.println();
        System.out.printf("The count of unique integers entered is: %d%n", numList.size());
        System.out.printf("The sum of unique integers entered is: %d%n", uniqueSum);
        System.out.printf("The average of unique integers entered is: %.2f%n", uniqueAvg);
    }

    // get an array of numbers using getNumbers
    public static int[] getNumbers(int count) {
        
        // Declare a scanner to get user input
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[count];

        // loop for the specified count and get values from the user, storeing
        // them in an array to return once we have the values
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter an integer value: ");
            numbers[i] = input.nextInt();
        }
        input.close();
        return numbers;
    }

    // calculations for sums of numbers
    public static int sumNum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int sumNum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static double avgNum(int[] numbers) {
        if (numbers.length == 0)
            return 0;
        return (double) sumNum(numbers) / numbers.length;
    }

    public static double avgNum(ArrayList<Integer> numbers) {
        if (numbers.isEmpty())
            return 0;
        return (double) sumNum(numbers) / numbers.size();
    }
}