package pdfOcp.question163;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Question163 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 0, 8, 1, 9, 5, 7, 6, 4);
        LocalTime start = LocalTime.now();
        int sum = numbers.stream().reduce(0, (n, m) -> n + m);
        LocalTime end = LocalTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, end));

        LocalTime now = LocalTime.now();
        Integer reducePara = numbers.stream().parallel().reduce(0, (n, m) -> n + m);
        LocalTime nowed = LocalTime.now();
        System.out.println(ChronoUnit.MILLIS.between(now, nowed));

    }
}
