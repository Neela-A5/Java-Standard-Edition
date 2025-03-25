public class javapracticesession {
    public static void main(String[] args) {
        System.out.println("pattern print number 01");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("pattern print number 02");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern print number 03");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (6 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("pattern print number 03");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }System.out.println();
        }

        System.out.println();
        System.out.println("pattern print number 04");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("pattern print number 05");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= 4; i++){
           for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 4; k >= i; k --) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("pattern print number 06");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if(k == 1 || k == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (5-i); k++) {
                   if(k == 1 || k == (5-i))
                    System.out.print("* ");
                   else
                       System.out.print("  ");
   }
            System.out.println();
        }
    }
}