package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1008 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int number=input.nextInt();
        int B= input.nextInt();
        float C= input.nextFloat();
        float salary;
        salary=B*C;
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n ",salary);

    }
}
