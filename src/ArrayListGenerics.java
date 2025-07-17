import java.util.ArrayList;
import java.util.List;

public class ArrayListGenerics {
    public static void main(String[] args) {
        ArrayList kodnest = new ArrayList();
        student s1 = new student("Neela", 101);
        student s2 = new student("Suma", 102);
        student s3 = new student("Mumma", 103);

       kodnest.add(s1);
       kodnest.add(s2);
       kodnest.add(s3);

       display(kodnest);
    }
    public static void display(List<student> kod){
        System.out.println("List of students: " +kod.size());
        System.out.println("list of students: " + kod );

    }
}
class student{
    String name;
    int roll;
    public student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    public String toString() {
        return "student[name= " + name + ", roll= " + roll +"]";

    }
}
