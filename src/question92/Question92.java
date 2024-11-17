package question92;

import java.util.stream.IntStream;

public class Question92 {
    public static void main(String[] args) {
        var i = 2;
        int sum = IntStream.generate(() -> {
                    return i;
                })
                .limit(100).sum();
        System.out.println(sum);

        System.out.println(IntStream.rangeClosed(1,100).count());
        System.out.println(IntStream.rangeClosed(0,100).map(x->x).count());
        System.out.println(IntStream.range(1,100).count());

    }
}
