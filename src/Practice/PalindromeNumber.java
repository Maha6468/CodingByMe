package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        int revers=0,remind;
        int i=0;
        int store=n;
        for(;0<n;i++){              //for(int i=0;0<n;i++) ata korleo hoy
             remind=n%10;
            revers=revers*10+remind;
            n/=10;
        }
        System.out.println(revers);
        if(store==n){
            System.out.println("It's palindrom number");
        }else {
            System.out.println("It's not a palindrom number");
        }


    }
}
