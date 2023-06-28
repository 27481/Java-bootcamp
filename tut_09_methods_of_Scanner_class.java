import java.util.Scanner;

public class tut_09_methods_of_Scanner_class {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in); //! Making an object of class Scanner named (sc) which has lots of methods used to take input 

    boolean b1=sc.hasNextInt();
    System.out.println(b1);

    sc.close();
  }
}
