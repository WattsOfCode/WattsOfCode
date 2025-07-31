/*
    1.7 PA Classes, Objects, Methods, and Strings
    SDC230 | Object-Oriented Programming Using Java
    Name: John Deardorff
    Date: 06/18/2025

    Instructions:
    use of of constructors, getters and setters, class methods, 
    and instance variables (class properties). Incorporate the following... 
    
    requirements into your application:
    The application will consist of two files - the main application class (App.java) 
    and the Employee class (Employee.java)
    |   Include documentation at the top of each file that includes
    |       Your name
    |       Date of development
    |       Assignment (e.g., SDC230 Performance Assessment - Classes)
    |_______Description of the class__________________________________________________
    
    The Employee class must meet the following requirements
    |   Include private instance variables (properties) for the following:
    |       -First Name (String)
    |       -Last Name (String)
    |_______-Monthly Salary (double)__________________________________________________

        Include a public constructor    
        Include parameters to initialize all variables
            Only set the Monthly Salary if the provided salary is greater 
            than or equal to 1000

        Include setters and getters for each instance variable
            Only set the Monthly Salary if the provided salary is greater 
            than or equal to 1000

    The main application class must meet the following requirements
        Print a line that states "Your Name - Week 1 PA Classes"
        Create 2 Employee class objects (instances)
            Use an invalid salary for one of the employees
        Print the name and salary information for each employee with a header line 
        above the information.
         Update the employee information as follows
            Update the last name of one employee
            Update the first name of the other employee
            Update the salary information of both employees
        Print the updated employee information for each employee with a header line 
        above the information
 */

public class App {
    public static void main(String[] args) {
        System.out.println("John_Deardorff - Week 1 PA - Classes");
        //create emp obj
        Employee emp1 = new Employee("Bruce","Wayne",4500.00);
        Employee emp2 = new Employee("Berry", "Allen", 2200.00);
        
        //Display initial employee info
        System.out.println("\nInitial information for each employee ");
        displayEmployee(emp1);
        displayEmployee(emp2);
        
        //updating employee info
        
        emp1.setfirstName("Bat");
        emp2.setfirstName("Green");

        emp1.setlastName("Man");
        emp2.setlastName("Lanturn");

        emp1.setmonthlySalary(2800.00);
        emp2.setmonthlySalary(900.00);

        //display updated info
        System.out.println("\nUpdated information for each employee ");
        displayEmployee(emp1);
        displayEmployee(emp2);

        System.out.println("");
    }   
    private static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getfirstName() + " " + emp.getlastName());
        System.out.printf("Monthly Salary: $%.2f\n", emp.getMonthlySalary());
    }
}
