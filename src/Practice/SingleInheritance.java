
class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof woof!");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
    }
}

