package AnisulAllClassCodeMe;
class Person{
    String name;
    int age;
    void display1(){
        System.out.println("Name : "+name);
        System.out.println("Age: "+age);
    }
}

 class Teacher1 extends Person{
    String qualification;
    void display2(){
        display1();
        //System.out.println("Name: "+name);
        //System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
    }
}

public class Inheritance128 {
    public static void main(String[] args) {
    Teacher1 t1=new Teacher1();
    t1.name="Maha";
    t1.age=23;
    t1.qualification="BSc in CSE";
    t1.display2();

    }
}
