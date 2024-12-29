package ocp1Z0_829.question22;

import java.util.Collections;
import java.util.List;

public class Question22 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Integer reduce = listOfNumbers.parallelStream().reduce(5, Integer::sum);
        System.out.println(reduce);

    }
}
