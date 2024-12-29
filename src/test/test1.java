package test;

import java.util.Random;

public class test1 {
    private static Random rand = new Random(40);
    public static void main(String[] args) {
        byte a = 12;
        short b = 13;
        int i = rand.nextInt(50);
        System.out.println(i);
    }
}
