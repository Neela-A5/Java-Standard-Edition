public class basicLoop {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int m = 4;
        for(int i = 1; i <= m; i++) {
           for(int j = 1 ; j <= i; j++) {
                System.out.print(" ");
            }
            for( int k = m; k >= i; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
