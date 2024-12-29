package pdfOcp.question33;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question33 {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana","orange","apple","lemon");
        Stream<String> s1 = fruits.stream();
        Stream<String> s2 = s1.peek(i -> System.out.print(i + " "));
//        s2.collect(Collectors.joining(","));
        System.out.println("-----------");
        Stream<String> s3 = s2.sorted();
        Stream<String> s4 = s3.peek(i -> System.out.print(i + " "));
        System.out.println("-----------");
        String collect = s4.collect(Collectors.joining(","));
//        String collect2 = s3.collect(Collectors.joining(","));
    }
}