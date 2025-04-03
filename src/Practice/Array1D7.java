package Practice;

import java.util.Scanner;

public class Array1D7 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] numbers={10,20,30,40,50};                //declare int[] numbers  ,Memory allocate numbers=new int[5] ,initialize  number[0]=10;.....
        System.out.println(" value of 0 index: "+numbers[0]);
        System.out.println(" value of 1 index: "+numbers[1]);
        System.out.println(" value of 2 index: "+numbers[2]);
        System.out.println(" value of 3 index: "+numbers[3]);
        System.out.println(" value of 4 index: "+numbers[4]);

        System.out.println("\n");

        String[] names={"Yamin","Ibnul","Naim","Noman","Zayan"};
        System.out.println("Name of 0 index: "+names[0]);
        System.out.println("Name of 1 index: "+names[1]);
        System.out.println("Name of 2 index: "+names[2]);
        System.out.println("Name of 3 index: "+names[3]);
        System.out.println("Name of 4 index: "+names[4]);



    }
}
