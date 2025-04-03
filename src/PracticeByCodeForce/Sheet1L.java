package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1L {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String F1=input.next();     //String F1=input.nextLine(); ata dicila,
        String S1=input.next();
       // String name1=F1+" "+S1;   //F1 and S1 add korar jonno
        String F2=input.next();
        String S2=input.next();
        if (S1.equals(S2)){
            System.out.println("ARE Brothers");
        }else {
            System.out.println("NOT");
        }

    }
}
