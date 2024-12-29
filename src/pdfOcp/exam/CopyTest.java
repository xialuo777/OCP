package pdfOcp.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        Path currentFile = Paths.get("src/question150/scratch/exam/temp.txt");
        Path outputFile = Paths.get("src/question150/scratch/exam/new.txt");
        Path directory = Paths.get("src/question150/scratch/");
        Files.copy(currentFile, outputFile);
//        Files.copy(currentFile, directory);
        Files.copy(outputFile, directory);
        Files.delete(outputFile);
    }
}
