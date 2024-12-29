package pdfOcp.question112;

public class Subs extends Question112{
    Subs(){
        this(4);
        System.out.println("1");
    }
    Subs(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        new Subs(4);
    }

}

