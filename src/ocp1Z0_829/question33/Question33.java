package ocp1Z0_829.question33;

import java.util.Arrays;

public class Question33 {
    public static void main(String[] args) {
        Arrays.stream(Desig.values()).dropWhile(s->s.equals(Desig.CMO));
        Desig cmo = Desig.valueOf("CMO");
        switch (Desig.valueOf("CMO")){
            case CMO -> System.out.println("CMO");
            case CEO -> System.out.println("CEO");
            case CFO -> System.out.println("CFO");
            case CTO -> System.out.println("CTO");
            default -> System.out.println("default");
        }
    }
}
