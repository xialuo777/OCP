package pdfOcp.question137;

public class Bar extends Foo{

    protected String a(){
        return "Bonjour le monde!";
    }

    public String b(){
        return a();
    }

}
