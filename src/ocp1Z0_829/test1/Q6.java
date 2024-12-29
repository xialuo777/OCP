package ocp1Z0_829.test1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 15:25]
 */

public class Q6 {
    //    public static void main(String[] args) {
//        String str = Stream.of("apple", "banana", "cherry", "date", "elderberry")
//                .dropWhile(s -> s.length() < 6)
//                .collect(Collectors.joining(","));
//        System.out.println(str);
    public static void main(String[] args) {
        String str = Stream.of("apple", "banana", "cherry", "date", "elderberry")
                .dropWhile(s -> s.length() < 6)
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }

}
