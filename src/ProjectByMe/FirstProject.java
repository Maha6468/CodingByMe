package ProjectByMe;
import java.util.Scanner;
public class FirstProject {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("This is my home rules program ");
        System.out.print("Enter your home location: ");
        String place=input.nextLine();
        System.out.println("My home is : "+place);
        System.out.print("How is your house means type: ");
        int type=input.nextInt();
        input.nextLine();   //clear the buffer. ata utiya deko
        System.out.println("It is "+type+" story apartment building.");
        System.out.print("Do you live in a rented house ? ");
        String answer=input.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println(answer + " , we live in a rented house.");
        }
        else {
            System.out.println(answer+" we live in our own house. ");
        }
        System.out.print("Do you want to take this house ? ");
        String reply=input.nextLine();
        if(reply.equalsIgnoreCase("yes")) {
            System.out.println(reply + " actually,I am looking for a house .");
        }
        else{
            System.out.println(reply);
        }
        



    }
}
