package pdfOcp.question165;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question165 {
    public static void main(String[] args) {
        Stream<Integer> data = IntStream.range(0, 10).boxed();
        int sum = data.mapToInt(a -> a).sum();
        System.out.println(sum);
    }
}
