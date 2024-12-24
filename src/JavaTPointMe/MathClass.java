package JavaTPointMe;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a negative number or any number : ");
        int x=input.nextInt();
        int M=Math.abs(x);
        System.out.println(M);

        System.out.print("Enter 2 number for max and min : ");
        int a= input.nextInt();
        int b= input.nextInt();
        int max=Math.max(a,b);
        System.out.println("Max number is : "+max);
        int min=Math.min(a,b);
        System.out.println("Min number is : "+min);

        System.out.print("Enter 2 number for Power : ");
        int c= input.nextInt();
        int d= input.nextInt();
        double pow=Math.pow(c,d);                        // akhane double er jaygay int dislam vul hoice
        System.out.println("Power is : "+pow);

        System.out.print("Enter a number for square : ");
        int e=input.nextInt();
        double root=Math.sqrt(e);                         // akhaneo int dislam vul hoicilo
        System.out.println("The root is : "+root);

        System.out.print("Enter 2 value for roun and rounddown number : ");
        double f=input.nextDouble();
        double g=input.nextDouble();
        long round=Math.round(f);
        long roundDown=Math.round(g);
        System.out.println("Round number is : "+round);
        System.out.println("Round down is : "+roundDown);

        System.out.print("Enter 2 number for ceil and floor : ");
        double h=input.nextDouble();
        double i=input.nextDouble();
        double ceil=Math.ceil(h);
        System.out.println("Value of ceil : "+ceil);
        double floor=Math.floor(i);
        System.out.println("Value od floor : "+floor);

        System.out.print("Enter a random value : ");
        int j=input.nextInt();
        double random=Math.random();
        System.out.println("Random is : "+random);

        System.out.print("Enter a value for sin,cos,tan,cot : ");
        int k=input.nextInt();
        double sin=Math.sin(1/k);
        System.out.println("The value of sin is : "+sin);
        int l=input.nextInt();
        double tan=Math.tan(3/l);
        System.out.println("The value of tan is : "+tan);

        System.out.print("Enter the value for log : ");
        int m=input.nextInt();
        double log=Math.log(m);
        double log10=Math.log10(m);
        System.out.println("The value of log is :"+log);
        System.out.println("The value of log10 is : "+log10);

        System.out.print("Enter a value for exp : ");
        int n=input.nextInt();
        double exp=Math.exp(n);
        System.out.println("The value of exp : "+exp);






    }
}
