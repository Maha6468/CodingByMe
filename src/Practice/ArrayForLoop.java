package Practice;

import java.util.Scanner;

public class ArrayForLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int [] arr={10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Index "+i+" : "+arr[i]); //Index number show
            sum+=arr[i];
        }
        System.out.println(sum);                //sum
        System.out.print("\n");
        for(int num:arr){                       //some same
            System.out.println(num);
            sum+=num;
        }
        System.out.print("\n");
        System.out.println(sum);





    }
}
