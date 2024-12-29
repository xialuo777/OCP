package pdfOcp.question115;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question115 {
    public static void main(String[] args) {
        Path path = Paths.get("src/pdfOcp.question115/course.txt");

        try {
            Stream<String> stream = Files.readAllLines(path).stream().filter(s -> s.contains("Java"));
//            stream.forEach(System.out::println);
            Files.lines(path).filter(s -> s.contains("Java")).forEach(s -> {
                String lowerCase = s.toLowerCase();
                System.out.println(lowerCase);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
