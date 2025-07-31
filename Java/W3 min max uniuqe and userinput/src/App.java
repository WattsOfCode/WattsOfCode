/*******************************************************************
 * Author: John Deardorff
 * Date: 07/13/2025
 * Assignment: SDC230 | Midterm Practical Exam
 * 
 * Task: 
 * Class discription: prints line stating my name with - Midterm Practical Exam
 * obtain 10 integer values from user and store them in an array  or an ArrayList
 * - write a method determining the largest element in collection and
 *   a method determining the smallest element in the collection
 * 
 * Display the following information for the collection
 * - All the elements in the collection and the index of the element (
 * displayed in columns as follows.)
 * 
 * {col1, col2}
 * {col1, col2}
 * 
 * The smallest elements in the collection
 * The largest elements in the collection
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    //Print title and name
        System.out.println();
        System.out.println("John Deardorff - Midterm Practical Exam");
        System.out.println();
    
        //Set array size
        int setArray = 10;
        int[][] numArr = getNumbers(setArray);

        // get ArrayList from second column
        ArrayList<Integer> values = getValuesList(numArr);

        //finding min and max
        int min = findMin(values);
        int max = findMax(values);

        //display the two-column array
        displayNumbers(numArr);

        //display min and max
        System.out.printf("The smallest number is: %d%n", min);
        System.out.printf("The largest number is: %d%n", max);
        System.out.println();
    }

    //get numbers from user and store in array with index
    public static int[][] getNumbers(int count) {
        Scanner input = new Scanner(System.in);
        int[][] numbers = new int[count][2];

        for (int i = 0; i < count; i++) {
            System.out.print("Please enter an integer value: ");
            //store index and user input
            numbers[i][0] = i;
            numbers[i][1] = input.nextInt(); 
        }
        input.close();
        return numbers;
    }

    //Extract values from the second column
    public static ArrayList<Integer> getValuesList(int[][] numbers) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int[] num : numbers){
            values.add(num[1]);
        }
        return values;
    }

    //Display the two columns
    public static void displayNumbers(int[][] numbers) {
        System.out.println("Values Entered:");
        System.out.println("Index\tValue");

        for (int[] num : numbers) {
            System.out.printf("%5d\t%5d%n", num[0], num[1]);
        }
        System.out.println();
    }
    
    //minimum value from second column
    public static int findMin(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0;
        int min = values.get(0);
        for (int num : values) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //max value from second column
    public static int findMax(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0;
        int max = values.get(0);
        for (int num : values) {
            if (num > max) {
                max = num;
            }
        }
        return max;    
    }
}
