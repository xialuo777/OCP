package pdfOcp.quesiton177;

public class Question177 {
    public static void main(String[] args) {
        String s = "hat at store";
        int x = s.indexOf("at");
        s.substring(x + 3);
        x = s.indexOf("at");
        System.out.println(s + " " + x);
    }
}
