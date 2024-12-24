package AnisulAllClassCodeMe;
class AddDemo{
    void add(int ...num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
public class VariableLengthArgument121 {
    public static void main(String[] args) {
        AddDemo ob=new AddDemo();
        ob.add(20,30);
        ob.add(50,10,85,30);
        ob.add(45,90,45);
    }
}
