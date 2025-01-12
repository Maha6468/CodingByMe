package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1014 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int X= input.nextInt();
        float Y= input.nextFloat();
        double average=X/Y;
        System.out.printf("%.3f km/l\n",
        average);

    }
}
