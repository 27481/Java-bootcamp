package tut_25_Practice_set_string;

import java.util.Scanner;

public class Q1 {
    //! write a Java Program to convert a stirng to lowercase 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:\n");
        
        String name = sc.nextLine();

        System.out.println(name.toLowerCase());
        sc.close();
    }
}
