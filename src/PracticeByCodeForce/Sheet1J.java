package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1J {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int A= input.nextInt();
        int B= input.nextInt();
        if(A%B==0||B%A==0){
            System.out.println("Multiples");
        }
        else
            System.out.println("No Multiples");
    }
}
