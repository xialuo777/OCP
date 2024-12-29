package pdfOcp.question162;

public class Question162 {
    static String s;

    public static void main(String[] args) {
        s = new String();
        switch (s) {
            case "41":
                s += "41";
            default:
                s += "def";
            case "42":
                s += "42";
            case "43":
                s += "41";
        }
        System.out.println(s);
    }
}
