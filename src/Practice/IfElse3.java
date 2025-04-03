package Practice;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Please enter a integer value");
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number.");             //System.out.println(num+" even number.");
        }
        else                                                //without else run,but without if not run
        {
            System.out.println("Odd number.");
        }

    }
}
