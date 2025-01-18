package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1G {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        long N= input.nextLong();
        //long summation=0;
       /* for(int i=1;i<=N;i++){
            summation+=i;               //atao right chilo but time besi nice
        }
        System.out.print(summation);*/

        /*
        int i=1;
        while(i<=N){
            summation+=i;                   //atao same chilo but time nice
            i++;
        }
        System.out.println(summation);*/



        System.out.println(N*(N+1)/2);              //ata just oneline ai ,how!


    }
}
