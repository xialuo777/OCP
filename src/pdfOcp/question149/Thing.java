package pdfOcp.question149;

public class Thing {
    int x, y, z;

    public Thing(int x, int y) {
        System.out.println(x + "," + y + "," + z);
    }

    public static void main(String[] args) {
        Thing thing = new Thing(10, 20);
    }
}
