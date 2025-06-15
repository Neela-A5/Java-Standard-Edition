import java.util.Scanner;
import java.util.Arrays;

public class charFrequencyCount {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str = "Hello World";
        System.out.println("Original String: " + str);
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if(ch == ch1) {
                    count++;
                }
            }
            System.out.println(i + ": " + count);

        }

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int[] freq = new int[256]; // Frequency array
        boolean[] printed = new boolean[256]; // To check if character is already printed

        // First, count frequencies
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");
        // Then, print in the order of first appearance
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!printed[ch]) {
                System.out.println(ch + ": " + freq[ch]);
                printed[ch] = true; // Mark as printed
            }
        }




        scanner.close();


}
}















