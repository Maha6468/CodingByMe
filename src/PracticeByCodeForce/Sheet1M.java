package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1M {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        char Letter=input.next().charAt(0);
        if(Letter>='A'&&Letter<='Z'){
            System.out.print("ALPHA"+"\n"+"IS CAPITAL");
        } else if (Letter>='a'&&Letter<='z') {
            System.out.print("ALPHA"+"\n"+"IS SMALL");
        }else
            System.out.println("IS DIGIT");

    }
}
