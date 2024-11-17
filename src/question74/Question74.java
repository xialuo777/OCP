package question74;

import java.util.ArrayList;
import java.util.Iterator;

public class Question74 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        Iterator<Integer> iterator = a1.iterator();
        while (iterator.hasNext()) {

            if (iterator.next() == 2) {
                a1.remove(2);
                System.out.println(iterator.next());
            }
        }
    }
}
