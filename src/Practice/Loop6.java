package Practice;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n=input.nextInt();

        //for loop
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+" = "+(n*i));
        }



        //while loop
        /*
        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+" = "+(n*i));
            i++;
        }
           */

        //do while
        /*
        int i=1;
        do{
            System.out.println(n+"*"+i+" = "+(n*i));
            i++;
        }while(i<=10);
        */





    }
}
