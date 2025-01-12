package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1010 {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int code1= input.nextInt();
    int units1= input.nextInt();
    float price1= input.nextFloat();
    //int n1=input.nextInt();
    price1=(price1*units1);
    int code2= input.nextInt();
    int units2= input.nextInt();
    float price2= input.nextFloat();
   // int n2=input.nextInt();
    price2=(price2*units2);
    float price=price1+price2;
    System.out.printf("VALOR A PAGAR : R$ %.2f\n",price);


    }
}
