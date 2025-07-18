public class basiccode {

        static {
            System.out.println("Static block is executing");  //  1> it will execute before main()
        }

        {
            System.out.println("NnoStatic block is executing");   //  3> it will execute after main()
        }
        basiccode() {
            {
                System.out.println("Constructor block is executing");   //  3> it will execute after non-static block before calling constructor
            }
        }

    public static void main(String[] args) {

            System.out.println("main() method is executing"); //2> it will execute after static block;
            basiccode k1 = new basiccode();


    }
}
