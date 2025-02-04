public class basicPattern {
    public static void main(String[] args) {
        System.out.println("printing 4 rows and 4 columns using Asterisk (*)");
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j<= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println("printing 4 rows and 4 columns using Numbers.");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("printing 4 rows and 4 columns using Numbers.");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}






