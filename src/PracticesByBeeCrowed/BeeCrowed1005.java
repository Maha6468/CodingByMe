package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1005 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        float weightA=3.5f;
        float weightB=7.5f;
        float A=input.nextFloat();
        float B= input.nextFloat();
        float MEDIA= (A*weightA+B*weightB)/(weightA+weightB);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}
