package pdfOcp.question121;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = List.of(new Player("Scott", 15), new Player("John", 70), new Player("Jelly", 105));
        double v = players.stream().mapToDouble(a -> a.score).average().orElse(0.0);
        double v1 = players.stream().mapToInt(a -> a.score).average().orElse(0.0);
        System.out.println(v);
        System.out.println(v1);
        Path path = Paths.get("src/pdfOcp.question121/file");
        if (!path.toFile().exists()) {
            path.toFile().mkdir();
        }

    }
}
