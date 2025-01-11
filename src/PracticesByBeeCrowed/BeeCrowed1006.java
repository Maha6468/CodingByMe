package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1006 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        float weightA=2f;
        float weightB=3f;
        float weightC=5f;
        float A=input.nextFloat();
        float B=input.nextFloat();
        float C=input.nextFloat();
        float MEDIA=(A*weightA+B*weightB+C*weightC)/(weightA+weightB+weightC);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
