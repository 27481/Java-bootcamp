import java.util.Scanner;

public class tut_16_Types_of_operators {
    // Operators are used to perform operations on variables and values 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Arithmatic Operator 
        int a = 4;

        //2 . Modulo Operator 
        int b =6/a;
        System.out.println(b);
        // 4.8%1.1 --> Returns Decimal.Remainder 

        //3. Comparison Operator
        System.out.println(6==8);          

        //4. AND Operator
        System.out.println(64>5 && 64<8);  


        //5. OR Operator
         System.out.println(64>5 || 64<8); 


        //6. BitWise Operator 
        System.out.println(2&3);
        
        sc.close();
    }
}
