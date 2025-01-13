package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //chatgpt

       /* double N = input.nextDouble();
        int totalCents = (int) Math.round(N * 100);
        System.out.println("NOTAS:");
        int[] notes = {100, 50, 20, 10, 5, 2};
        for (int note : notes) {
            int count = totalCents / (note * 100);
            totalCents %= (note * 100);
            System.out.printf("%d nota(s) de R$ %.2f\n", count, (double) note);
        }

        System.out.println("MOEDAS:");
        int[] coins = {100, 50, 25, 10, 5, 1};
        for (int coin : coins) {
            int count = totalCents / coin;
            totalCents %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, coin / 100.0);
        }*/



        //myself
                double N= input.nextDouble();
                System.out.println("NOTAS:");
                int[] notes={100,50,20,10,5,2};
                double[] coin={1,0.50,0.25,0.10,0.05,0.01};
                for(int X:notes){
                    int count= (int)(N/X);
                    N%=X;
                    System.out.printf("%d nota (s) de R$ %.2f\n",count,(double)X);
                }
                System.out.println("MOEDAS:");
                for(double Y:coin){
                    int count1=(int)(N/Y);
                    N%= Y;
                    System.out.printf("%d moeda (s) de R$ %.2f\n",count1,Y);
                }



    }
}