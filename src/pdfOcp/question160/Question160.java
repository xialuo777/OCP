package pdfOcp.question160;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Question160 {
    public static void main(String[] args) {
        List states = new ArrayList(List.of("NY", "CA", "WA", "NC", "CO"));
        Predicate function = s-> ((String) s).contains("N");
        states.removeIf(function);
        System.out.println(states);

    }
    private static double toUnit(){
        return 1.0;
    }
}
class test{
    void main(String[] args) {

    }
}