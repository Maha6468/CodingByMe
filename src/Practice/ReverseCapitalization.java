package Practice;
import java.util.Scanner;
public class ReverseCapitalization {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        input.nextLine();
        for(int i=1;i<=n;i++){
            String word= input.nextLine();
            StringBuilder result=new StringBuilder();
            for(char ch:word.toCharArray()){
                if(Character.isLowerCase(ch)){
                   result.append(Character.toUpperCase(ch));
                }else {
                    result.append(Character.toLowerCase(ch));
                }
            }
            System.out.println(result);
        }
    }
}
