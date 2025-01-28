package Practice;

import java.util.Scanner;

public class PalindromeWordChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n= input.nextInt();
        input.nextLine();
        for(int i=0;i<n;i++){
            String word= input.nextLine();
            String reverse=new StringBuilder(word).reverse().toString();
            if(word.equalsIgnoreCase(reverse)){
                System.out.println("Palindrome word.");
            }else {
                System.out.println("Not palindrome word.");
            }


        }

    }
}
