package ocp1Z0_829.question18;

public class Question18 {
    public static void main(String[] args) {
        String myStr = "Hello Java 17";
        String myTestBlk1 = """
                Hello Java 17""";
        String myTestBlk2 = """
                Hello Java 17
                """;
        System.out.println(myStr.equals(myTestBlk1));
        System.out.println(myStr.equals(myTestBlk2));
        System.out.println(myTestBlk1.equals(myTestBlk2));
        System.out.println(myTestBlk1.intern() == myTestBlk2.intern());
        System.out.println(myTestBlk1.intern());
        System.out.println(myTestBlk2.intern());
    }
}
