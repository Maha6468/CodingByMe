package AnisulAllClassCodeMe;
class Person1{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
class Teacher2 extends Person1{
    //getName,setName,getAge,setAge()
    private String qualification;

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
    void display2(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}
public class InheritaingPrivateMemberWithSetterAndGetter129 {
    public static void main(String[] args) {
        Teacher2 t1=new Teacher2();
        t1.setName("Maha");
        t1.setAge(23);
        t1.setQualification("BSc in CSE");
        t1.display2();

    }
}
