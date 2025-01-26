package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       /* int[] arr1={15,12,5,20,35};
        int[] arr2={15,12,20,35};
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both are equal.");
        }else
            System.out.println("Both are not equal.");*/

        int[] arr1=new int[4];
        int[] arr2=new int[4];
        System.out.print("First array: ");
        for(int i=0;i<4;i++){
            arr1[i]=input.nextInt();
        }
        System.out.print("Second array: ");
        for(int i=0;i<4;i++){
            arr2[i]= input.nextInt();
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both are equal.");
        }else
            System.out.println("Both are not equal.");




    }
}
