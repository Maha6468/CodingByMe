package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1043 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        float A= input.nextFloat();
        float B= input.nextFloat();
        float C= input.nextFloat();
        if(A+B>C&&A+C>B&&B+C>A){
            System.out.printf("Perimetro = %.1f\n",A+B+C);
        }else
            System.out.printf("Area = %.1f\n",((A+B)*C)/2);


    }
}
