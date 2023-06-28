import java.util.Scanner;

public class tut_14_km_to_miles {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the distance in km which you want to convert into miles:\n");
            int km = sc.nextInt();

            double miles=km*0.621371;
            System.out.println(miles);
            
            sc.close();
        }
}
