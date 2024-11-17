package question72;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Question72 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        UnaryOperator<Integer> u = i -> i * 2;
        UnaryOperator<Integer> u =  i -> i * 2;
        List<Integer> doubledNumbers = list.stream()
                .map(u)
                .collect(Collectors.toList());
//        list.replaceAll(u);
        for (Integer i : doubledNumbers) {
            System.out.println(i);
        }
    }
}
