package ocp1Z0_829.test1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 15:30]
 */

public class Q7 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ocp1Z0_829/test1/temp/file1.txt");
//        FileWriter fileWriter = new FileWriter("src/ocp1Z0_829/test1/temp/subdir/file2.txt");
        PrintWriter printWriter = new PrintWriter(("src/ocp1Z0_829/test1/temp/file3.txt"));
    }
}
