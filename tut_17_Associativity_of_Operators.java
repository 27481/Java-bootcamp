import java.util.Scanner;

public class tut_17_Associativity_of_Operators 
{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a=30-34/2;
    /* highest precidence goes to * and / 
       They are then evaluated on the basis of left to right associativity 
       
       =30-34/2;
       =30-17;
       =13;

     */

    int b=12-34*2;
    /*  
    =12-34*2
    =12-68
    =-56
    */

    System.out.println(a);
    System.out.println(b);

    sc.close();
    }
}
