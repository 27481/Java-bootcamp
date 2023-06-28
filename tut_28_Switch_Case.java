import java.util.Scanner;

public class tut_28_Switch_Case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:\n");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        
        switch(age){
            case 18:
               System.out.println("you are going to become an Adult:\n");
               break;
            case 21:
               System.out.println("You are going to join a Job!");
               break;
            case 60:
               System.out.println("You are going to join a Job:");
                break;
            default:
                  System.out.println("Enjoy your life:\n");
        sc.close();
        }
        // if(age>56)
        //     System.out.println("you are experianced:\n");
        // else if(age>46)
        //      System.out.println("You are semi-experienced:\n");
        // else if(age>36)
        //      System.out.println("You are semi-experienced:\n");
        // else 
        // System.out.println("You are experienced:\n");       
        // sc.close();
    }
}
