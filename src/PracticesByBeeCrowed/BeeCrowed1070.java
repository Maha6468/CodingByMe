package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1070 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int X=input.nextInt();
        int count=0;
        while(count<6){
            if(X%2!=0){
                System.out.println(X);
                count++;
            }
            X++;
        }
    }
}
