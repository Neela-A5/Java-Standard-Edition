public class pattern {
    public static void main(String[] args) {
patern(3);
    }
    static void patern (int n){
        for(int row=1; row<=n;row++){
            for(int  col=1;col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
