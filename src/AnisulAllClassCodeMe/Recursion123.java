package AnisulAllClassCodeMe;
import java.util.Scanner;

/*class FactorialDemo{
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1); //akhane fact use na kore deko
    }
}*/
class SumofNNumber{
    int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
}


public class Recursion123 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       /* FactorialDemo ob= new FactorialDemo();
        int result=ob.fact(5);
        System.out.println("Factorial of  5: "+result);*/

        SumofNNumber ob=new SumofNNumber();
        System.out.print("How many number you want to sum: ");
        int m= input.nextInt();
        int result=ob.sum(m);
        System.out.println("Sum from  "+m+ "number: "+result);
    }
}
