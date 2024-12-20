package JavaTPointMe;

import java.util.Scanner;

public class StringMe {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the value of 1st charecter:");
        String str=input.nextLine();
        System.out.print("Enter the value of 2st charecter:");
        String str1=input.nextLine();
        System.out.print("Enter the value of Integer number:");
        int num=input.nextInt();

        System.out.println("Method of length :  " +str.length());

        System.out.println("Method of charAt :  "+str.charAt(3));

        char charterAtIndex=str.charAt(4);
        System.out.println("Method of charAt :  "+charterAtIndex);

        System.out.println("Method of substring / kothay start korate cai : "+str.substring(+4));

        System.out.println("Method of substring / where we want start and end : "+str.substring(2,4));

        System.out.println("Method of toUpperCase :  "+str.toUpperCase());

        System.out.println("Method of toLowerCase :  "+str.toLowerCase());

        System.out.println("Method of trim / space cut :  "+str.trim());

        System.out.println("Method of equals : "+str.equals(str1));        //ata diye Maha=Maha hbe but Maha=maha hbe na

        System.out.println("Method of equalsIgnoreCase : "+str.equalsIgnoreCase(str1));  //ata diye Maha=maha atao sman hbe mane true hbe



        System.out.println("Method of contains / input er vithor ai string ace ki na : "+str.contains("ha"));

        System.out.println("Method of replace : "+str.replace("a","t"));

        System.out.println("Method of replaceAll : "+str.replaceAll("[0-6]","#"));

        System.out.println("Method of startsWith : "+str.startsWith("Ma"));

        System.out.println("Method of endsWith : "+str.endsWith("bar"));

        System.out.println("Method of isEmpty : "+str.isEmpty());

        //Method of split jante hbe

        System.out.println("Method of indexOf : "+str.indexOf("Mahabub")); //mane niddristo string 1st koi paoya gece mane kon index a

        System.out.println("Method of lastIndexOf : "+str.lastIndexOf("h")); ////mane niddristo string last koi paoya gece mane kon index a

        System.out.println("Method of concat : "+str.concat(str1));


        String str3 = String.valueOf(num);     //onno data type ke string a poriborthon.
        System.out.println("Method of valueOf : "+str3);

       // System.out.println("Method of split : "+str.split(","));  //bujinai

        char[] chars1=str.toCharArray();
        for(char c: chars1){
            System.out.println("Method of toCharArray() : "+c);
        }


        System.out.println("Method of matchs / string er pattern tik ki na : "+str.matches("\\d+"));

        int code=str.codePointAt(0);
        System.out.println("Method of codePointAt / mane Unicode bole r ki : "+code);


        int code1=str.codePointBefore(1);
        System.out.println("Method of codePointBefore / ager letter er unicoder bole   : "+code1);


        int code3=str.codePointCount(1,5);
        System.out.println("Method of codePointCount : "+code3);    // akta niddhristo range a thake point er number bole

        System.out.println("Method of compareTo : "+str.compareTo(str1));   // 2 ta string er number compare kore letter na mane same compare kore na , number er different kore



    }
}