package Practice;

import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] arr={10,20,10,30,10,40,50};
        int countValue=10;
        int count=0;
        for(int num:arr){
            if(num==countValue){
                count++;
            }
        }
        System.out.println("My count value 10 is: "+count);

    }
}
