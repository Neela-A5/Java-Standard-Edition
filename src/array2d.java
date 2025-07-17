import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the rows number");
        int rows = sc.nextInt();

        System.out.println("Enter the columns number");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];

       /* arr[0][0]= 20;
        arr[0][1]= 21;
        arr[0][2]= 22;
        arr[0][3]= 23;

        arr[1][0]= 30;
        arr[1][1]= 31;
        arr[1][2]= 32;
        arr[1][3]= 33;

        arr[2][0]= 40;
        arr[2][1]= 41;
        arr[2][2]= 42;
        arr[2][3]= 43;

        */
        // instead of writing this lines of code we can take user input
        System.out.println("Enter the element for array");
        for(int i = 0;i < arr.length; i++) {
            System.out.println("Enter the element for" + i + " row of   array");
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        /*System.out.println(arr[0][0]= 20);
        System.out.println(arr[0][1]= 21);
        System.out.println(arr[0][2]= 22);
        System.out.println(arr[0][3]= 23);

        System.out.println(arr[1][0]= 30);
        System.out.println( arr[1][1]= 31);
        System.out.println(arr[1][2]= 32);
        System.out.println(arr[1][3]= 33);

        System.out.println(arr[2][0]= 40);
        System.out.println( arr[2][1]= 41);
        System.out.println( arr[2][2]= 42);
        System.out.println( arr[2][3]= 43);

         */
        // instead of using this much lines of print we can use for loop it will avoid code redundancy

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
