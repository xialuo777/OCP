package ocp1Z0_829.question14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question14 {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("car", "truck", "car", "bicycle", "car", "truck", "motorcycle");
        Map<String, Long> collect = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
