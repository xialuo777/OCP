package pdfOcp.question132;

import java.util.*;

public class Question132 {
    public static void main(String[] args) {
        var loc = List.of("UK", "US");
        var loc1 = Map.of("UK", 1, "US", 2);
        var uk = Set.of("UK", "US");
        for (String s : uk) {
            System.out.println(s);
        }
    }
}
