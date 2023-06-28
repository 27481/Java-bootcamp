import java.util.Scanner;


public class tut_15_number_is_int_or_not {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your number:\n");
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        System.out.println(sc.hasNextInt(num));
        sc.close();
    }

}
 