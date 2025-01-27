package Practice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        input.nextLine();    //nextInt er reke jaoya akta line finis kore dicce
        for(int i=0;i<n;i++){
            String word= input.nextLine();
            String reverse=new StringBuilder(word).reverse().toString();
            System.out.println(reverse);
        }

    }
}
