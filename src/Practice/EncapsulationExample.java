package Practice;
        class Person {
            private String name;
            private int age;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getAge() {
                return age;
            }
        }

            public class EncapsulationExample{
            public static void main(String[] args) {
                Person person = new Person();
                person.setName("Abu Sayed sir,");
                person.setAge(44);
                System.out.println("This is "+person.getName());
                System.out.println("He is "+person.getAge() + " years old.");

    }
}
