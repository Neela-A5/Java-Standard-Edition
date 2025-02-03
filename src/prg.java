public class prg {     // Example for method overloading in java
    // 1st JVM checks for main method and enters it
    public static void main(String[] args) {

     /* STEP 01:-  control goes to class addition and check for add method
     we are having 5 add method so control got that we are overloading the method

     STEP 02:- Control checks for two variables value, we have totally 4 methods having that 2 variables so coming out for this problem
     it will follow the step 3

     STEP 03:- Control checks variable type based on passed argument
     */
     addition.add(4,6);
     addition.add(2.2,3.3);
     addition.add(4,2.1);
     addition.add(5.2, 4);
     addition.add(2, 3,2);
    }
    class addition {
        public static void add(int a, int b) {
            System.out.println("sum = " + (a + b));
        }
        public static void add(double a, double b) {
            System.out.println("sum = " + (a + b));
        }
        public static void add(int a, double b) {
            System.out.println("sum = " + (a + b));
        }
        public static void add(double a, int b) {
            System.out.println("sum = " + (a + b));
        }
        public static void add(int a, int b, int c) {
            System.out.println("sum = " + (a + b + c));
        }
    }
}