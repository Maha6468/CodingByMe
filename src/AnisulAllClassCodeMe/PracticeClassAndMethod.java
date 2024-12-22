package AnisulAllClassCodeMe;
class Teacher{
    String name,gender;
    int phone;


//(Method inside a class=101)
   /* void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n" );
    }*/


//(parametrise method in a class=102)
void setInformation(String n,String m,int ph){
    name=n;
    gender=m;
    phone=ph;
}
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("\n");
    }
}





public class PracticeClassAndMethod {
    public static void main(String[] args) {
      /*  Teacher teacher1=new Teacher();
        teacher1.name="Maha";
        teacher1.gender="male";
        teacher1.phone=1761233398;
        System.out.println("Name: "+teacher1.name);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Phone: "+teacher1.phone);*/

//(Method inside a class=101)
      /*  teacher1.name="Maha";
        teacher1.gender="male";
        teacher1.phone=1761233398;
        teacher1.display();

        Teacher teacher2=new Teacher();
        teacher2.name="Nilufa";
        teacher2.gender="female";
        teacher2.phone=1761233;
        teacher2.display();*/

//(parametrised method in class=102)
        Teacher teacher1=new Teacher();
        teacher1.setInformation("Mahabub","male",1234);
        teacher1.display();
        Teacher teacher2=new Teacher();
        teacher2.setInformation("Jannat","female",34);
        teacher2.display();



    }
}
