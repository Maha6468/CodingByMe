package Practice;

import java.util.Scanner;

public class Array1DInput8 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] numbers=new int[5];
        System.out.println("Enter 5 numbers: ");
        numbers[0]=input.nextInt();
        numbers[1]=input.nextInt();
        numbers[2]=input.nextInt();
        numbers[3]=input.nextInt();
        numbers[4]=input.nextInt();
        System.out.println("Value of [0] index: "+numbers[0]);
        System.out.println("Value of [0] index: "+numbers[1]);
        System.out.println("Value of [0] index: "+numbers[2]);
        System.out.println("Value of [0] index: "+numbers[3]);
        System.out.println("Value of [0] index: "+numbers[4]);



        /*
        int sum=numbers[2]+numbers[4];
        System.out.println("Sum of two index: "+sum);
        */

    }
}
