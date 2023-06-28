import java.util.Scanner;

//! In order to read data from the keyboard , java has a scanner class 
//! Scanner has a lots of method to read the data from the keyboard 

public class tut_08_taking_input {
    public static void main(String[] args) {
    System.out.println("Taking input from the user:!");

    Scanner sc = new Scanner(System.in);  //* Making an object named(sc) of scanner class
    System.out.println("Enter number 1");

    float a = sc.nextInt();
    System.out.println("Enter number 2");

    float b = sc.nextInt();
    float sum=a+b;

    System.out.println("The sum of these numbers is ");
    System.out.println(sum);
    
    sc.close();
    }
        
}
