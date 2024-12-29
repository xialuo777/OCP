package ocp1Z0_829.question13;

import java.util.stream.Stream;

public class Question13 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("A", "B", "C", "D" );
        Stream<String> s2 = Stream.of("A", "A", "B", "E", "F", "G", "H");
        Stream.concat(s1, s2).distinct().parallel().forEach(System.out::println);
    }
}
