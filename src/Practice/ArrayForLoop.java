package Practice;

import java.util.Scanner;

public class ArrayForLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int [] arr={10,20,30,40,50,60};
        for(int i=0;i<arr.length;i++){
            System.out.println("Index "+i+" : "+arr[i]);
        }

    }
}
