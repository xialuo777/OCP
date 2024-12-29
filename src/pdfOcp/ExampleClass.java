package pdfOcp;


public class ExampleClass implements pdfOcp.question168.ExampleInterface {
    public static void main(String[] args) {
        ExampleClass theeInstance = new ExampleClass();
        int s = 2;
        int b = ~s;
        int c = s ^ b;
        int d = 2 ^ 3;
        int x = ++s;
        System.out.println(x);
    }

    @Override
    public void make() {
        System.out.println("Make");
    }
}
