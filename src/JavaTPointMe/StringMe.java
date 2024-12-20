package JavaTPointMe;

import java.util.Scanner;

public class StringMe {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the value of charecter:");
        String str=input.nextLine();
        String str1=input.nextLine();

        System.out.println("Method of length :  " +str.length());

        //char ch=input.next().charAt(0); // charecter diya dektecaicilam.
        System.out.println("Method of charAt :  "+str.charAt(3));

        char charterAtIndex=str.charAt(4);
        System.out.println("Method of charAt :  "+charterAtIndex);

        System.out.println("Method of substring / kothay start korate cai : "+str.substring(+4));

        System.out.println("Method of substring / where we want start and end : "+str.substring(2,4));

        System.out.println("Method of toUpperCase :  "+str.toUpperCase());

        System.out.println("Method of toLowerCase :  "+str.toLowerCase());

        System.out.println("Method of trim / space cut :  "+str.trim());

        System.out.println("Method of equals : "+str.equals(str1));

        System.out.println("Method of equalsIgnoreCase : "+str.equalsIgnoreCase(str1));

        System.out.println("Method of contains / input er vithor ai string ace ki na : "+str.contains("ha"));

        System.out.println("Method of replace : "+str.replace("a","t"));

        System.out.println("Method of replaceAll : "+str.replaceAll("[0-6]","#"));

        System.out.println("Method of startsWith : "+str.startsWith("Ma"));

        System.out.println("Method of endsWith : "+str.endsWith("bar"));

        System.out.println("Method of isEmpty : "+str.isEmpty());

        //Method of split jante hbe

        System.out.println("Method of indexOf : "+str.indexOf("Mahabub"));

        System.out.println("Method of lastIndexOf : "+str.lastIndexOf("h"));

        System.out.println("Method of concat : "+str.concat(str1));

        //Method of valiOf jante hbe . important



    }
}