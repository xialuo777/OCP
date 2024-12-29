package ocp1Z0_829.question31;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question31 {
    public static void main(String[] args) throws IOException {
        Path path = new File("src/ocp1Z0_829/question31/data.txt").toPath();
        Stream<String> lines = Files.lines(path);
        String collect = lines.collect(Collectors.joining("-"));
        System.out.println(collect);
        List<String> strings = Files.readAllLines(path);
        System.out.println(strings);
        System.out.println(strings.get(2));
    }
}
