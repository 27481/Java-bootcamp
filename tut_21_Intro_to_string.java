import java.util.Scanner;

public class tut_21_Intro_to_string {
    public static void main(String[] args) {
        // String is class but can be used like a data type        
        String name = new String("Utkarsh");
        System.out.println(name);
        System.out.println("The name is :");
        int a=6;
        float b=5.6453f;

        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("\nThe value of a is %d and value of b is %f\n", a, b);

        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        System.out.println(st);

        sc.close();
        
        // String is a class but cn be used like a dataType 
        // Strings are immutable and can not be changed 
    }        
}
