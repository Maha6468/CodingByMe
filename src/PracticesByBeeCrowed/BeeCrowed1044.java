package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1044 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int A= input.nextInt();
        int B= input.nextInt();
        if((A%B==0)||(B%A==0)){  // if(A%B==0)  ata korcilam vulhoicilo ,karon bro number ta age or pore thakte pare
            System.out.println("Sao Multiplos");
        }else
            System.out.println("Nao sao Multiplos");

    }
}
