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
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary >= 1000){
            this.monthlySalary = monthlySalary;
        }else{
            this.monthlySalary = 0.00;
        }
    }

    //getters and setters
    
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public void setmonthlySalary(double monthlySalary){
        if (monthlySalary >= 1000){
        this.monthlySalary = monthlySalary;
        }
    }
}
