package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1018 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int N= input.nextInt();
        System.out.println(N);
        int[] banknotes={100,50,20,10,5,2,1};
        for(int note:banknotes){
            int count=N/note;
            N%=note;
            //System.out.println(count+" nota(s) de R$ "+note);
            System.out.printf("%d nota (s) de R$ %d,00\n",count,note);
        }
    }

}
