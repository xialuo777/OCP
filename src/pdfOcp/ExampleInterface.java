package pdfOcp.question168;
@FunctionalInterface
public interface ExampleInterface {
    int one = 1;
    static int two = 2;
    static final int three = 3;
    public static final int four = 4;

    public abstract void make();

    public default void call(){
        System.out.println("Call Method");
    }
;
    private static void doMake(){
        System.out.println("do");
    }
}
