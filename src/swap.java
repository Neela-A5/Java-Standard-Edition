public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swapping the variable..."+a+" "+b);
        //  there are five different ways for swapping  two different value

        //                      1.  swapping two number using third number
         int c=a;
         a=b;
         b=c;
        System.out.println("after swapping the variable swapping two number using third number..."+a+" "+b);



        //                      2. using addition and subtraction method
         a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the variable  using addition and subtraction method..."+a+" "+b);



        //                       3. using multiplication and division method
          a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("after swapping the variable using multiplication and division method..."+a+" "+b);




        //                4. using bitwise operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping the variable using bitwise operator..."+a+" "+b);




        //            5. Single statement
          b=a+b-(a=b);     //   (a=b)---->the value of b is copied into a then (a=20)        a+b-(20)=30
                 System.out.println("after swapping the variable..."+a+" "+b);



    }
}



















































