package Practice;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //input=123:   sum=6

        int n=input.nextInt();
        int sum=0;
        while(0<n){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);


    }
}
