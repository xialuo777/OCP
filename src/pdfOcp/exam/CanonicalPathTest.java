package pdfOcp.exam;

import java.io.File;
import java.io.IOException;

public class CanonicalPathTest {
    public static void main(String[] args) {
        File file = new File("src/question150/scratch/exam/new.txt");
        try {
            String canonicalPath = file.getCanonicalPath();
            System.out.println(canonicalPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
