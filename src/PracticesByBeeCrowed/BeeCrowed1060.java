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






    }
}
