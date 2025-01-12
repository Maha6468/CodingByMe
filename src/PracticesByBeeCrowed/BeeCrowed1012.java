package PracticesByBeeCrowed;

import java.util.Scanner;

public class BeeCrowed1012 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        double A=input.nextDouble();
        double B=input.nextDouble();
        double C=input.nextDouble();
        double RectangleTriangleArea;
        RectangleTriangleArea=(.5)*A*C;
        System.out.printf("TRIANGULO: %.3f\n",RectangleTriangleArea);
        double CircleArea;
        CircleArea=3.14159*C*C;
        System.out.printf("CIRCULO: %.3f\n",CircleArea);
        double TrapeziumArea;
        TrapeziumArea=.5*(A+B)*C;
        System.out.printf("TRAPEZIO: %.3f\n",TrapeziumArea);
        double SquareArea;
        SquareArea=B*B;
        System.out.printf("QUADRADO: %.3f\n",SquareArea);
        double RectangleArea;
        RectangleArea=A*B;
        System.out.printf("RETANGULO: %.3f\n",RectangleArea);

    }
}
