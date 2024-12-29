package pdfOcp.question154;

public class Question154 {
    public void analyze(Object[] o){
        System.out.println("I am an object array");
    }
    public void analyze(long[] l){
        System.out.println("I am an array");
    }
    public void analyze(Object o){
        System.out.println("I am an object");
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        new Question154().analyze(ints);
    }
}
