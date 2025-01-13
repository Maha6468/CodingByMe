package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H= N/3600;;
        int M=(N%3600)/60;
        //int S=((N%3600)/60)%60;     //formula ta confuse
        int S=N%60;
        System.out.println(H+":"+M+":"+S);


    }
}
