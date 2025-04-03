package Practice;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        //it's for loop                                  for(initialize;condition check;i++/i--)
        System.out.println("Enter the n number: ");
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum is : "+sum);


        /*it's while loop
        System.out.println("Enter the n number: ");
        int n=10;
        int sum=0;
        int i=1;
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is : "+sum);
        */
        /*it's do-while loop
        System.out.println("Enter the n number: ");
        int n=10;
        int sum=0;
        int i=0;
        do{
            System.out.println(i);
            sum+=i;
            i++;
        }
        while(i<=n);
        System.out.println("Sum is : "+sum);
        */

    }
}
