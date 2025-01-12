package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1009 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String name=input.nextLine();
        double salary= input.nextDouble();
        double sales= input.nextDouble();
        double total;
        total=((sales*15/100)+salary);
        System.out.printf("TOTAL = R$ %.2f\n",total);


    }
}
