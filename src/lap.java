import java.util.Scanner;

public class lap {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc =new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter your " + i + " th number");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


    }
}
