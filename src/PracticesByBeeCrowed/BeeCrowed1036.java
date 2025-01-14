package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1036 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        //input gula float diya vul hoicilo
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double R1,R2;
        double D=(b*b)-(4*a*c);
        if(D<0){
            System.out.println("Impossivel calcular");
        } else if (a==0) {
            System.out.println("Impossivel calcular");
        } else  {
            R1=(-b+Math.sqrt(D))/(a+a);
            R2=(-b-Math.sqrt(D))/(a+a);
            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }






    }
}
