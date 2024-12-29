package pdfOcp.question140;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question140 {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(ints);
//        UnaryOperator<Integer> uo = x -> x * 3;
        UnaryOperator<Integer> uo = (var x) -> (x * 3);
//        UnaryOperator<Integer> uo =  x -> return (x * 3);
    }
}
