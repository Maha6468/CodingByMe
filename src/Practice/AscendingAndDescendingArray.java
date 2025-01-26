package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescendingArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={30,15,5,40,22};
        Integer[] arr1={55,34,10,2,40};
        Arrays.sort(arr);
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.print("Ascending array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.print("\nDescending array: ");
        for (int num:arr1){
            System.out.print(num+" ");
        }



    }
}
