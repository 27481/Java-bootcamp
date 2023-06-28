import java.util.Scanner;

public class tut_20_increment_decrement_operator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int i=56;
            int b=i++; // first b is assigned i then i us incremented
            int j=67;
            int c=++j; // first j is incremented then c is assigned j 

            //! Increment and Decrement Operators 
            System.out.println(i++); // use i then increment 
            System.out.println(i);  
            System.out.println(++i); // increment i then use it 
            System.out.println(i);

            System.out.println(b);
            System.out.println(c);
            System.out.println("\n");
            

            int y=7;
            System.out.println(++y*8);
            System.out.println("\n");

            char ch='a';
            System.out.println(++ch);
            
            sc.close();
        }
}
