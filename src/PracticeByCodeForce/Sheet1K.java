package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1K {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();
       /* //minimum
     if(A<B&&A<C){
         System.out.print(A+" ");
     } else if (B<C) {
         System.out.print(B+" ");
     }else {
         System.out.print(C+" ");
     }
        //maximum
        if(A>B&&A>C){
            System.out.print(A);
        } else if (B>C) {
            System.out.print(B);
        }else {
            System.out.print(C);
        }*/

        //ternari operator
        int minimum=(A<B)?(A<C?A:C):(B<C?B:C);
        System.out.print(minimum+" ");
        int maximum=(A>B)?(A>C?A:C):(B>C?B:C);
        System.out.println(maximum);

    }
}
