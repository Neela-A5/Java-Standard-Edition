
public class javapattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Java pattern for W alphabet");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j == 1 || j == 5 || (i == 3 && j == 3) || (i == 4 && (j == 2 || j ==4) )) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("Java Pattern for M alphabet");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j == 1 || j == 5 || (i == 3 && j == 3) || (i == 2 && (j == 2 || j == 4))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
