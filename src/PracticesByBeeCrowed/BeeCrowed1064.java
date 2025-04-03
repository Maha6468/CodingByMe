package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1064 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int count=0;
        float sum=0;
        for(int i=1;i<=6;i++){
            float number= input.nextFloat();
            if(number>0){
                count++;
                sum+=number;
            }
        }
        System.out.println(count+" valores positivos");
        System.out.printf("%.1f\n",sum/count);


    }
}
