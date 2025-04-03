class Student {
    public String name;
    public int age;
}

public class WithoutSetterGetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Maha";
        s1.age = 2;
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
    }
}
