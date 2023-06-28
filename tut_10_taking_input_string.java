import java.util.Scanner;

public class tut_10_taking_input_string {
        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your string:");
                        
            String str = sc.nextLine();            
            System.out.println(str);
            sc.close();
        }
}
