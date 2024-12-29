package pdfOcp.question139;

public class Question139 {
    public static void main(String[] args) {
        StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
        int i = 0;
        a:
        while (i < txt1.length()) {
            char x = txt1.charAt(i);
            int j = 0;
            i++;
            b:
            while (j < txt1.length()) {
                char y = txt1.charAt(j);
                if (i != j && x == y) {
                    txt1.deleteCharAt(j);
                    break b;
                }
                j++;
            }
        }
        System.out.println(txt1);
    }
}
