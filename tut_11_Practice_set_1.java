import java.util.Scanner;

public class tut_11_Practice_set_1 {
    /* 
     write a program to calculte percentage of a given student in CBSC board exam .His marks from 5 student must be taken as input from the keyboard (Marks are out of 100)
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1=45;
        int s2=45;
        int s3=5;
        int s4=45;
        int s5=45;

        float sum=(s1+s2+s3+s4+s5);
        float percentage = (sum/500)*100;
        System.out.println(percentage);

        sc.close();

     }
}
