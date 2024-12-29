package ocp1Z0_829.test1;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 15:41]
 */

public class Q8 {
    public static void main(String[] args) {
        Calculable[] arr = new Calculable[3];
        for (Calculable calculable : arr) {
            System.out.println(calculable.PI + " ");
        }
    }
}

interface Calculable{
    double PI = 3.14159;
}

class Cal{
    public static String test = "test";
}
