package Practice;

        class Maha {
            void maha() {
                System.out.println("Maha eats food");
            }
        }

        class Ibnul extends Maha {
            void ibnul() {
                System.out.println("Ibnul eats Biriyani");
            }
        }

        class Yamin extends Monday {
            void yamin() {
                System.out.println("Yamin eats water");
            }
        }

        public class MultilevelInheritance {
            public static void main(String[] args) {
                Yamin yamin = new Yamin();
                yamin.maha();
                yamin.ibnul();
                yamin.yamin();

                Monday ibnul=new Monday();
                ibnul.maha();
                ibnul.ibnul();
              //  ibnul.yamin();                              no run

            }
        }





