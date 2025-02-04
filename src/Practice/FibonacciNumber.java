package Practice;
import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
             int first=0,second=1;
             int next;
             for(int i=1;i<=n;i++){
                 System.out.println(first);
                 next=first+second;
                 first=second;
                 second=next;
                 }
            }
        }





