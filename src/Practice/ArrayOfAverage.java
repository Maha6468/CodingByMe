package Practice;

import java.util.Scanner;

public class ArrayOfAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println("Some of elements: "+sum+"\n");
        double average=(double) sum/arr.length;
        System.out.println("Average of Array: "+average);


    }
}
