package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1020 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int age= input.nextInt();
        int Y=age/365;
        int M=(age%365)/30;
        int D=(age%365)%30;

        System.out.println(Y+" ano(s)\n"+M+" mes(es)\n"+D+(" dia(s)"));
    }
}
