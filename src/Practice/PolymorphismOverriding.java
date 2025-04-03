package Practice;

    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public class PolymorphismOverriding {         //Run-time polymorphism
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            myAnimal.sound();
            Animal myDog = new Dog();
            myDog.sound();
            Animal myCat = new Cat();
            myCat.sound();

        }
    }





