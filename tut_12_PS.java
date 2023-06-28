import java.util.Scanner;

public class tut_12_PS {
    public static void main(String[] args) {
        // Question 1
        int a=4;
        int b=7;
        int c=6;

        int sum=a+b+c;
        System.out.println(sum);

        //Question 2
        int subject1=45;
        int subject2=95;
        int subject3=48;

        float cgpa = (subject1+subject2+subject3)/30; //! Operation bw 2 integers always produce an integer
        System.out.println(cgpa);

        //Question 3
        System.out.println("What is your name:\n");
        Scanner sc = new Scanner (System.in);
        
        sc.close();
    }    
}
