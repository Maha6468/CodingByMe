package ProjectByMe;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    double grade;
    Student(int n,String m,double g){
        id=n;
        name=m;
        grade=g;
    }
    void display(){
        System.out.println("Id: "+id+ "Name: "+name+ "Grade: "+grade);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        int choice;
        do{
            System.out.println("\n---Student Management System---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter student id: ");
                    int id=input.nextInt();
                    input.nextLine();
                    System.out.println("Enter student name: ");
                    String name=input.nextLine();
                    System.out.println("Enter student grade: ");
                    double grade=input.nextDouble();

                    students.add(new Student(id,name,grade));
                    System.out.println("Student added succcessfully!");
                    break;
                case 2:
                    System.out.println("\n---Student List---");
                    if(students.isEmpty()){
                        System.out.println("No students available.");
                    }
                    else{
                        for(Student student:students){
                            student.display();
                        }
                    }
                    break;
                    case 3:
                        System.out.println("Exiting the system.GoodBye!");
                        break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        while(choice!=3);
        {
            input.close();
        }
    }
}
