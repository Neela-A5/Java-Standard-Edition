public class constuructorchaning {
    public static void main(String[] args) {
        new Carr();
       // new Carr(10);
       // new Carr(10, 20);

    }
}
class Carr {
    public Carr() {
        this(10);
        System.out.println("0-param Constructor");

    }
    public Carr(int i) {
        this(10, 20);
        System.out.println("1-param Constructor");
    }
    public Carr(int i , int j) {
        System.out.println("2-param Constructor");
    }
}
