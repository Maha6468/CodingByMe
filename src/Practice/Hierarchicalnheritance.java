package Practice;

    class Animals {
        void eat() {
            System.out.println("Animal eats food");
        }
    }

    class Dogs extends Animals {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    class Cats extends Animals {
        void meow() {
            System.out.println("Cat meows");
        }
    }

public class Hierarchicalnheritance {
        public static void main(String[] args) {
            Dogs dog = new Dogs();
            dog.eat();
            dog.bark();

            Cats cat = new Cats();
            cat.eat();
            cat.meow();
           // cat.bark();               not run


        }
    }


