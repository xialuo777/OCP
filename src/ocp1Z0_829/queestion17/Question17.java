package ocp1Z0_829.queestion17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question17 {
    public static void main(String[] args) {
        char[] buffer = new char[9];
        int count = 0;
        try (FileReader in = new FileReader("src/ocp1Z0_829/queestion17/in");){
            FileWriter out = new FileWriter("src/ocp1Z0_829/queestion17/out.txt");

            while ((count = in.read(buffer)) != -1){
                out.write(buffer);
                System.out.println(count);
            }
            out.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
