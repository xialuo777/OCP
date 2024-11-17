package question100;

import java.util.function.Function;

public class Question100 {
    public static void main(String[] args) {
        Function tripler = x -> {
            return (Integer)x * 3;
        };
        Question100.printValue(tripler,4);

    }

    public static void printValue(Function f, Integer num) {
        System.out.println(f.apply(num));
    }
}
