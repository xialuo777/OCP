package question63;

import java.util.List;
import java.util.Optional;

public class Question63 {
    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");
        Optional<String> optional = fruits.parallelStream().filter(fruit -> fruit.contains("n")).findAny();
        System.out.println(optional.get());;
    }
}
