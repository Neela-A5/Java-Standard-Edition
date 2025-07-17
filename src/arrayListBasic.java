import java.util.*;
public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(10);
        al.add(30);
        al.add(400);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {         // it checks that List has next element or not
            System.out.println(itr.next());  // starting it points to the out of the list index and next means it will move pointer
            //to next element
        }



/* Using  Enhanced for loop
        for(Object ob : al) {
            System.out.println(ob)
     }

 */



/*      simple for loop
        for(int i = 0; i < al.size(); i++ ) {
            System.out.println(al.get(i) );            // we cannot use Like(al[i])
        }

 */

    }
}
