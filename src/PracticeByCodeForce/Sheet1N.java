package PracticeByCodeForce;

import java.util.Scanner;

public class Sheet1N {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
                char X =input.next().charAt(0);
                char result;
                if (Character.isUpperCase(X)) {
                    result = Character.toLowerCase(X);
                    System.out.println(result);
                } else if (Character.isLowerCase(X)) {
                    result = Character.toUpperCase(X);
                    System.out.println(result);
                }
            }
        }
        


