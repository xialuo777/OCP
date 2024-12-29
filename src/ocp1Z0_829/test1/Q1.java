package ocp1Z0_829.test1;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 14:08]
 */

public class Q1 {
    public static void main(String[] args) {
        int count = 5;
        int i = count++;
        int j = ++count;
        System.out.println(i+":" + j);
        if (count++ == ++count) {
            System.out.println("EQUAL" + count);
        } else {
            System.out.println("NOT EQUAL" + count);
        }
    }
}
