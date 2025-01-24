package Practice;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] arr1={10,20,30};
        int[] arr2={5,15,30};
        int[] sum= new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
            //System.out.println(sum[i]);           //atao hoy
        }

        for(int result:sum){
            System.out.println(result);
        }





    }
}
