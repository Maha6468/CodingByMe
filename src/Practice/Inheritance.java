package Practice;

    class GrandFather {
        void GdF() {
            System.out.println("This animal eats food");
        }
    }

    class Father extends GrandFather {
        void Ftr() {
            System.out.println("Dog barks");
        }
    }

    class Son extends GrandFather {
        void Sn() {
            System.out.println("Cat meows");
        }
    }




        public class Inheritance {
        public static void main(String[] args) {
            Father father = new Father();
            father.GdF();
            father.Ftr();

            Son son = new Son();
            son.GdF();
            son.Sn();


        }
    }

