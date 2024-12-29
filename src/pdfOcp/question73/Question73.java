package pdfOcp.question73;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question73 {
    public static void main(String[] args) {
        String fileName = "src/pdfOcp.question73/lines.txt" ;
//        String fileName = "lines.txt";
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.filter(line -> !line.equalsIgnoreCase("JAVA -"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        list.forEach(System.out::println);
    }
}
