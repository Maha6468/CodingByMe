package Practice;

import java.util.Scanner;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] arr={10,15,20,25,30,35};
        System.out.println("Even number: ");
        for(int num:arr){
            if(num%2==0){

                System.out.print(num+" ");
            }
        }
        System.out.println("\nOdd number: ");
        for(int num:arr){
            if(num%2!=0){
                System.out.print(num+" ");
            }
        }

    }
}
