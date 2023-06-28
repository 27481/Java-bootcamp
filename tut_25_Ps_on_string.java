import java.util.Scanner;

public class tut_25_Ps_on_string {
    //! Q1  write a Java Program to convert a stirng to lowercase 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:\n");
        
        String name = sc.nextLine();

        System.out.println(name.toLowerCase());

    //! Q2 Write a java program to replace spaces with underscore 
    String temp= sc.nextLine();
    System.out.println(temp.replace(" ","_"));
    
    //! Q3 Write a Java program to fill in a letter template which looks like below:
    // letter =" Dear <|name|>, Trans a pt"
    // Replace = <|name|> with a string (some name)

    String letter="dear <|name|>, Thanks a lot!";
    letter=letter.replace("<|name|>","utkarsh");
    System.out.println(letter);    

    //! Q4 Write a java program to detect double and triple spaces in a String 
    String myString= "This string contains  double and triple spaces";
    System.out.println(myString.indexOf("  "));
    System.out.println(myString.indexOf("   "));

    //! Q5 Write a java program to format the following letter using escape sequence characters 
    String myletter="Dear utkarsh, \n\tThis java course is nice , \n\tThanks";
    System.out.println(myletter);
    

    sc.close();
    }    
}
