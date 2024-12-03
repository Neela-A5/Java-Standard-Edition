import java.util.Scanner;

public class alphornot {
    public static void main(String[] args) {
        char ch ='g';
        // using ascii value
        if((ch >= 'a' && ch<= 'z' ) || ch >= 'A' && ch <= 'Z'){


            System.out.println(" (using ascii) :->the given character is alphabet.... " +ch);
        }
        else {
            System.out.println("using ascii):->   the given character is not an alphabet " + ch);
        }





        // using isLetter() method
        if(Character.isLetter(ch)){
            System.out.println(" (using isLetter() method):->   the given character is alphabet.... " +ch);
        }
        else {
            System.out.println("  (using isLetter() method):->   the given character is not an alphabet " + ch);
        }





       // using regex method
        if( String .valueOf(ch).matches("[A-Za-z]")){
            System.out.println("(using regex method):->   the given character is alphabet.... " +ch);
        }
        else {
            System.out.println("(using regex method):->  the given character is not an alphabet " + ch);
        }













    }
}

