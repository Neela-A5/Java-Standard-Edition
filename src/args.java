import java.util.Scanner;

public class args {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character:");
        char character = scanner.next().charAt(0);

      int count = 0;
      for(int i = 0; i <= input.length()-1; i++) {
          if(input.charAt(i) == character) {
              count++;
          }
      }

        System.out.println("Number of characters: " + count);

        scanner.close();
   

    }
}
