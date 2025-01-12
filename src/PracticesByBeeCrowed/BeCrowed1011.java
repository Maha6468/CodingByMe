package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeCrowed1011 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        float R=input.nextFloat();
        double V;
        V=((4.0/3)*3.14159*R*R*R);
        System.out.printf("VOLUME = %.3f\n",V);
    }
}
