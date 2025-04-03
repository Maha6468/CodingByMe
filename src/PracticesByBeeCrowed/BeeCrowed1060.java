package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1060 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       int count=0;
        for(int i=1;i<=6;i++){
            double number= input.nextDouble();
            if(number>0){
                count++;
            }
        }
        System.out.println(count+"valores positivos");



               /* //avabeo hoito
                int[] numbers = {-3, 5, -7, 12, 8, -1};

                int positiveCount = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > 0) {
                        positiveCount++;
                    }
                }


                System.out.println("Number of positive numbers: " + positiveCount);*/








    }
}
