package pdfOcp.question174;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Question174 {
    public static void main(String[] args) {
        IntStream str = IntStream.of(2, 3, 4);
        int number = 20;
        Predicate<Integer> pre = x -> x % 2 != 0;
        if (pre.test(number)) {
            System.out.println(number+" is odd");
        }else {
            System.out.println(number+" is even");
        }
    }
}
