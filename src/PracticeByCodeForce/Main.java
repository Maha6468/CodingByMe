
    package PracticeByCodeForce;

    class Father {
        private String name;
        private int age;
        public Father(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Father mz = new Father("Mostafizur Rahman", 53);
            mz.display();
        }
    }

