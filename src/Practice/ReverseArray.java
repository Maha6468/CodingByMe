package Practice;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] arr={10,20,30,40,50};
        int reverse;
        for(int i=arr.length-1;i>=0;i--){           //Reverse Array
            reverse=arr[i];
            System.out.print(reverse+" ");
        }



    }
}
