package pdfOcp.question118;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Question118 {
    public static void main(String[] args) {
        String[] words = {"am","am","first","second","mismatch"};
        Map map = Arrays.stream(words)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);

    }
}
