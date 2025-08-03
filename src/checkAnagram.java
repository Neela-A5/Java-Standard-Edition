import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st name ");
        String str = sc.nextLine().toLowerCase();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("Enter your 2st name ");
        String str1 = sc.nextLine().toLowerCase();
       char[] ch1 = str1.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch);

       boolean status = Arrays.equals(ch, ch1);
        System.out.println("The given strings are Anagram: " + status);

    }
}
