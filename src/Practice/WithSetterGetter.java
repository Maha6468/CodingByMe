package Practice;
class Student{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class WithSetterGetter {
    public static void main(String[] args) {
       Student std=new Student();
       std.setName("Maha");
       std.setAge(23);
        System.out.println("Student name is: "+std.getName());
        System.out.println("Student age is: "+std.getAge());
    }
}
