import java.util.Scanner;

public class tut_13_String_concatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String name = sc.nextLine();
        System.out.println("Hello "+name+" have a good day!");
        sc.close();
    }    
}
