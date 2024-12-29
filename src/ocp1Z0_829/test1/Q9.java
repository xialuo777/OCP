package ocp1Z0_829.test1;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 15:52]
 */

public class Q9 {
    public static void main(String[] args) {
        String secretCode = "hceolndceeapltaein";
        try (StringReader reader = new StringReader(secretCode)) {
            while (reader.ready()){
                reader.skip(2);
                System.out.println((char)reader.read());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
