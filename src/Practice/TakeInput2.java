package Practice;

import java.util.Scanner;

public class TakeInput2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the Byte value: ");
        byte a=input.nextByte();

        System.out.print("Enter the integer value: ");
        int b=input.nextInt();

        System.out.print("Enter the short value: ");
        short c= input.nextShort();

        System.out.print("Enter the long value: ");
        long d= input.nextLong();

        System.out.println("Enter the float value: ");
        float e= input.nextFloat();

        System.out.println("Enter the double value: ");
        double f= input.nextDouble();

        System.out.println("Enter the char value: ");
        char g=input.next().charAt(0);

        System.out.println("Enter the string value: ");
        String h= input.nextLine();

        input.nextLine();                                                 // without input.nextLine
        System.out.println("Enter the boolean value: ");
        boolean i=input.nextBoolean();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(!i);


        /*

          byte a=input.nextByte();
          int b=input.nextInt();
          short c= input.nextShort();
          long d= input.nextLong();
          float e= input.nextFloat();
          double f= input.nextDouble();
          char g=input.next().charAt(0);
          String h= input.nextLine();
          boolean i=input.nextBoolean();

        */

    }
}
