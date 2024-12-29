package pdfOcp.question135;

import java.util.Comparator;
import java.util.List;

public class Question135 {
    public static void main(String[] args) {
        List fruits = List.of("apple", "orange", "banana");
        fruits.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        System.out.println(fruits);
//        fruits.sort((String a, String b) -> (b.compareTo(a)));
//        fruits.sort((a, b) -> ( return b.compareTo(a);));

    }
}
