package pdfOcp.question124;

import java.io.Console;
import java.util.Arrays;

public class Question124 {
    public static void main(String[] args) {
        String[] towns = {"boston", "paris", "bangkok", "oman"};
        Arrays.sort(towns,(a,b)->a.compareTo(b));
        System.out.println(Arrays.binarySearch(towns,"oman"));
        Console console = System.console();

        console.readPassword();
    }
}
