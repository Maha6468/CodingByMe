package Practice;

import java.util.Scanner;

public class VowelCountFromAWord {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        String S;
        for(int i=0;i<n;i++){
            S= input.next();
            int count=0;
            for(char L:S.toLowerCase().toCharArray()){
                if(L=='a'||L=='e'||L=='i'||L=='o'||L=='u') {
                    count++;
                }
            }
            System.out.println("Vowel: "+count);
        }
    }
}
