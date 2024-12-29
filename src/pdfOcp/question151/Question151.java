package pdfOcp.question151;

public class Question151 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1.intern();
        String s4 = new String("Java");
        StringBuilder sb1 = new StringBuilder("Java");
        String s3 = sb1.toString();
        System.out.println(s2 == s4);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(sb1.toString()));
        System.out.println(s2 == s3);
    }
}
