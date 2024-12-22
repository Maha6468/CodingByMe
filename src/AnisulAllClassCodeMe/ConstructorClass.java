package AnisulAllClassCodeMe;
class Test{
    String name,gender;
    int phone;
    Test(){
        System.out.println("No information");
    }
    Test(String n,String g){
        name=n;
        gender=g;
        //phone=176123398;   // akbar diya deko akbar na diya deko
    }
    Test(String n,String g,int p){
        name=n;
        gender=g;
        phone=p;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Name: "+gender);
        System.out.println("Name: "+phone);
        System.out.println("\n\n");
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        Test teacher1=new  Test();
        teacher1.display();
        Test teacher2=new  Test("Maha","Male");
        teacher2.display();
        Test teacher3=new  Test("Mariya","female",123);
        teacher3.display();
    }
}
