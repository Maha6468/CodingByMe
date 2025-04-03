package Practice;

import java.util.Scanner;

public class ElseIf4 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Please enter 1st integer value");
        int num1=input.nextInt();
        System.out.println("Please enter 2nd integer value");
        int num2=input.nextInt();
        if(num1>num2)
        {
            System.out.println("Greater number is: "+num1);
        }
        else if (num2>num1)
        {
            System.out.println("Greater number is: "+num2);
        }
        else
        {
            System.out.println("Both number are equal");
        }

    }
}
