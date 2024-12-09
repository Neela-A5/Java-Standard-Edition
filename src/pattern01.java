public class pattern01 {
    public static void main(String[] args) {
ptr(4);
    }
     static  void  ptr(int n){
        for(int row=n;row>=0; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
