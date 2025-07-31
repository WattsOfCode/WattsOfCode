/******************************************************************************************
 * Author: John Deardorff
 * Date: 07/22/2025
 * Assignment: SDC230 - Final Practical Exam
 * 
 * Unique class for retrieving the unique values from the user
 *        Gathers unique numbers from user 
 *          not using any ununique number
 *        Calls ArrayList and Sanner inports
 *        try - catch used within getNumber function 
 *          makes sure no other input is accepted other than 0 - 100
 *          Exception with print statement will not break number request
 *              loop
 *        Print methods
 *          print unique numbers ( this will use a count with max number of values)
 *          print min ( calculation from calculation method)
 *          print max ( calculation from calculation method)
 *          print sum ( calculation from calculation method)
 *          print average ( calculation from calculation method)
 *          print divided ( with try catch for ArithmeticException and calculation method)
 *        Calculation methods
 *          Cacluclates maxNum the mininum value in the ArrayList
 *          Cacluclates minNum the maximum value in the ArrayList
 *          Cacluclates sumNum the sum value in the ArrayList
 *          Cacluclates avgNum the average value in the ArrayList
 *          Cacluclates divNum the Mininum and Maximum Values in the ArrayList 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Unique {

    // call array list - renamed as values for simple calculation.
    ArrayList<Integer> values = new ArrayList<>();

    // get unique numbers with try-catch
    public void getNumbers(int count) {
        Scanner input = new Scanner(System.in);
        
        // takes in value size of 5 and runs while state until count 
        // is reached
        while (values.size() < count) {
            System.out.print("Please enter an integer value: ");
            try {
                int num = input.nextInt();

                // range for validation throws Exception
                if (num < 0 || num > 100) {
                    throw new Exception();
                }

                if (values.contains(num)) {
                    continue;
                }
                values.add(num);

            // Exception for anything typed other than within 0 - 100 range
            } catch (Exception e) {
                System.err.printf(
                    "%s: Please enter an integer between 0 and 100, inclusive %n", e);
                input.nextLine(); // clear buffer
            }
        }
        input.close();
    }
    
    // display print statment for array list through a counter, "  " added for seperation.
    public void printUniqueNumbers() {
        System.out.println("Unique Values Entered: ");
        for (int i = 0; i < values.size(); i++){
            System.out.print(values.get(i) + "  ");
        }
        System.out.println();
    }

    //print statements using calculation methods 
    public void printMin() {
        System.out.printf("Min Values Entered: %s%n", minNum());
    }
    public void printMax(){
        System.out.printf("Max Values Entered: %s%n", maxNum());
    }
    public void printSum(){
        System.out.printf("Sum of Values Entered: %s%n", sumNum());
    }
    public void printAvg(){
        System.out.printf("Average of Values Entered: %s%n", avgNum());
    }

    // print statement for div with try-block
    public void printDiv() {
        try {
            //check if min value entered is zero
            if (minNum() == 0) {
                throw new ArithmeticException();
            } else {
                System.out.printf("Last Value Divided by First Value: %s%n", divNum());
            }
        } catch (ArithmeticException e) {
            System.err.printf("%s: / by zero %n", e);
        }
    }
    
    /*  Calculations methods: min, max, sum, avg, and div
        each method will return values for use in print methods 
        min and max will get index values for checks            
    */
    private int minNum() {
        int min = values.get(0);
        for (int value : values) {
            if (value < min) min = value;
        }
        return min;
    }
    private int maxNum() {
        int max = values.get(0);
        for(int value : values){
            if(value > max) max = value;
        }
        return max;
    }
    private int sumNum() {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }
    
    // using double for avgNum and divNum to be able to get more accurate return values
    private double avgNum() {
        return (double) sumNum() / values.size();
    }

    // pulls methos from minNum and maxNum Values for calculation on divNum
    private double divNum() {
        int firstValue = values.get(0);
        int lastValue = values.get(values.size() - 1);
        return (double) lastValue / firstValue;
    }
}