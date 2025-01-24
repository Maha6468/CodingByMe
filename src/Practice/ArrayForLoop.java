package Practice;

import java.util.Scanner;

public class ArrayForLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int [] arr={10,20,30,5,50,60};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Index "+i+" : "+arr[i]); //Index number show
            sum+=arr[i];
        }
        System.out.println(sum);                //sum
        System.out.print("\n");
        for(int num:arr){                       //same same
            System.out.println(num);
            sum+=num;
        }
        System.out.print("\n");
        System.out.println(sum);
        System.out.println("\n");

       int max=arr[0];                          //Max value
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
        System.out.println("Maximum Value: "+max);

       int min=arr[0];                          //Min Value
       for(int i=1;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }

       }
        System.out.println("Minimum value: "+min);





    }
}
