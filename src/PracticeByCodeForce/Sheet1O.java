package PracticeByCodeForce;


import java.util.Scanner;

public class Sheet1O {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int A=input.nextInt();
        char C=input.next().charAt(0);
        int B= input.nextInt();
        if(C=='+'){
            System.out.println(A+B);
        } else if (C=='-') {
            System.out.println(A-B);
        } else if (C =='*') {
            System.out.println(A*B);
        } else if (C=='/') {
            System.out.println(A/B);
        }

    }
}
