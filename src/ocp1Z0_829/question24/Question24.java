package ocp1Z0_829.question24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question24 {
    public static void main(String[] args) {
        List lst = new ArrayList<>();
        lst.add("e1");
        lst.add("e3");
        lst.add("e2");

        int i = Collections.binarySearch(lst, "e3");
        System.out.println(i);
        Collections.sort(lst);
        int i2 = Collections.binarySearch(lst, "e3");
        System.out.println(i2);
        Collections.reverse(lst);
        int i3 = Collections.binarySearch(lst, "e3");
        System.out.println(i3);

        String s = "1000";
        Integer i1 = 250 + Integer.parseInt(s);
        System.out.println(i1);
        Integer s2 = 10_00;
        System.out.println(s2+250);
        Integer i4 = Integer.valueOf(s);
        System.out.println(i4);
        Integer i5 = Integer.valueOf("10_00");
    }
}
