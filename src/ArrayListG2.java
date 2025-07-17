import java.util.ArrayList;
import java.util.List;

public class ArrayListG2 {
    public static void main(String[] args) {
        fruits f1 = new fruits("Apple", 100);
        fruits f2 = new fruits("Orange", 150);
        fruits f3 = new fruits("Grapes", 60);

        ArrayList fruitsList = new ArrayList();
        fruitsList.add(f1);
        fruitsList.add(f2);
        fruitsList.add(f3);

        display(fruitsList);


    }
    public static void display(List<fruits> fruitsList) {
        System.out.println("Number of different fruits: " + fruitsList.size());
        System.out.println("List of fruits: " + fruitsList);
    }
}
class fruits{
    String name;
    int rate;
    public fruits(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public String toString(){
        return "fruits[ name = " + name + ", rate = " + rate +"]";
    }
}
