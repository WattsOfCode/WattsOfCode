/* 
    1.6 PA Input / Output and operators
    SDC230 | Object-Oriented Programming Using Java
    Name: John Deardorff
    Date: 06/18/2025
    Requirements 1:
        -Main application class
        +Print a line that states "Your Name - Week 1 PA IO & Operators"
        +Demonstrate integer-based operations
        +Retrieve 2 integer values from the user
        +Display the sum of those two values
        +Display the comparison results of value 1 to value 2, including:
        +Equality - whether the values are equal or not equal.
        +Size - whether value 1 is greater than or less than value 2.
        +Size with equality - whether value 1 is greater than or equal 
        to or less than or equal to value 2.
    Requirements 2
        +Demonstrate floating point-based operations
        +Retrieve 2 floating point values from the user
        +Display floating point values to 4-decimal point precision
        +Display the sum of those two values
        Display the comparison results of value 1 to value 2, including:
        Equality - whether the values are equal or not equal.
        Size - whether value 1 is greater than or less than value 2.
        Size with equality - whether value 1 is greater than or equal 
        to or less than or equal to value 2.
    */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tJohnDeardorff - Week 1 PA IO & Operators");
        System.out.println("");
        
        //user prompt input
        System.out.print("Enter your first integer value: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter your second integer value: ");
        int value2 = scanner.nextInt();

        //here is the sum callculated
        int sum = value1 + value2;
        System.out.printf("The sum of %d and %d is %d%n", value1, value2, sum);

        // camparison results to check -
        // -if the problem is greater, less than or equal too.
        System.out.printf("Equality: %d %s %d%n", value1, 
            (value1 == value2 ? "equals" : "does not equal"), value2);

        if (value1 != value2 ) {
            System.out.printf("Equality: %d %s %d%n", value1, 
                (value1 < value2 ? "is less than" : "is greater than"), value2);
            //checks if value it greater or equal too or less or equal too than value 2
            System.out.printf("Equality: %d %s %d%n", value1, 
                (value1 > value2 ? "is greater or equal too" : "is less or equal too"), value2);
            }else if( value1 == value2){
            System.out.printf("Equality: %d %s %d%n", value1, 
                (value1 <= value2 ? "is less than or equal" : "is greater or equal"), value2);
            System.out.printf("Equality: %d %s %d%n", value1, 
                (value1 >= value2 ? "is greater or equal " : "is less or equal too"), value2);
        }
       
        //Floating point-based operations
        System.out.print("\nEnter your first integer with decimal: ");
        double float1 = scanner.nextDouble();
        System.out.print("Enter your second float value: ");
        double float2 = scanner.nextDouble();

        //calculate sum of floats
        double floatSum = float1 + float2;
        System.out.printf("The sum of the %.4f and %.4f is %.4f%n", float1, float2, floatSum);

        //checks if float values are equaL, less(or equal), greater(or equal).
        System.out.printf("Equality: %.4f %s %.4f%n", float1, 
            (float1 == float2 ? "equals" : "does not equal"), float2);

        if (float1 != float2 ) {
            System.out.printf("Equality: %.4f %s %.4f%n", float1, 
                (float1 < float2 ? "is less than" : "is greater than"), float2);
            //checks if floats it greater or equal too or less or equal too than float 2
            System.out.printf("Equality: %.4f %s %.4f%n", float1, 
                (float1 > float2 ? "is greater or equal too" : "is less or equal too"), float2);
            }else if( float1 == float2){
            System.out.printf("Equality: %.4f %s %.4f%n", float1, 
                (float1 <= float2 ? "is less than or equal" : "is greater or equal"), float2);
            System.out.printf("Equality: %.4f %s %.4f%n", float1, 
                (float1 >= float2 ? "is greater or equal " : "is less or equal too"), float2);
        }
        System.out.println(" ");
    }
}
