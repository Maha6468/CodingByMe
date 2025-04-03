package Practice;
class Calculation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

    public class PolymorphismOverloading1 {               //compile-time polymorphism
    public static void main(String[] args) {
    Calculation clt=new Calculation();
        System.out.println(clt.add(5,6 ));
        System.out.println(clt.add(4,10,6));

    }
}
