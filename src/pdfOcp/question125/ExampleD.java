package pdfOcp.question125;

import java.io.IOException;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleD {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(System.out);
        printStream.write("hello".getBytes());
//        printStream.write(3);
        printStream.flush();

        Stream.of(1,2,3).peek(i-> System.out.println(i)).collect(Collectors.toList());

    }
}
