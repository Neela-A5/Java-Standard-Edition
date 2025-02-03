import java.util.Scanner;
public class numberSign {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input < 0) {
            System.out.println("The given input " + input + " is Negative number");
        } else if (input > 0) {
            System.out.println("The given input " + input + " is Positive number");
        } else  {
            System.out.println("The given input " + input + " is Zero number");

        }
    }

}
