public class constructorOverlod {
    public static void main(String[] args) {
        new Carr();
        new Carr(10);
        new Carr(10, 20);

    }
}
class Car {
    public Car() {
        System.out.println("0-param Constructor");
    }
    public Car(int i) {
        System.out.println("1-param Constructor");
    }
    public Car(int i , int j) {
        System.out.println("2-param Constructor");
    }
}
