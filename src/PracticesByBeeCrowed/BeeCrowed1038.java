package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1038 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int X=input.nextInt();
        int Y= input.nextInt();
        //System.out.printf("Total: R$ %.2f\n",P);
        if(X==1){
            System.out.printf("Total: R$ %.2f\n",(double)(4.00*Y));
        } else if (X==2) {
            System.out.printf("Total: R$ %.2f\n",(double)(4.50*Y));
        } else if (X==3) {
            System.out.printf("Total: R$ %.2f\n",(double)(5.00*Y));
        } else if (X==4) {
            System.out.printf("Total: R$ %.2f\n",(double)(2.00*Y));
        } else if (X==5) {
            System.out.printf("Total: R$ %.2f\n",(double)(1.50*Y));
        }


    }
}
