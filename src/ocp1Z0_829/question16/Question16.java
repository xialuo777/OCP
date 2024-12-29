package ocp1Z0_829.question16;

import java.io.Console;

public class Question16 {
    public static void main(String[] args) {
        Console console = System.console();
        int i = Integer.parseInt(console.readLine("Enter a number: "));
        if (i % 2 == 0) {
            System.out.println(i + " is even");
        }else if (i % 2 == 1) {
            System.out.println(i + " is odd");
        }
    }
}
