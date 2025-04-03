package DataStructure;
import java.util.Scanner;
public class MaxValueAndLocationOfArray21 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number of elements in the array: ");
                int N = input.nextInt();
                int[] DATA = new int[N];
                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < N; i++) {
                    DATA[i] = input.nextInt();
                }

                //int[] DATA={54,48,69,73,59};
                int LOC = 0;
                int MAX = DATA[0];
                for (int K = 1; K < DATA.length; K++) {
                    if (DATA[K] > MAX) {
                        MAX = DATA[K];
                        LOC = K;
                    }
                }
                System.out.println("Largest value: " + MAX);
                System.out.println("Location (Index): " + LOC);
                input.close();


    }
}
