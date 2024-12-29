package pdfOcp.question137;
public class Baz extends Bar{
    public String b(){
        return a();
    }


    public static void main(String[] args) {
        System.out.println(new Foo().b());
        System.out.println(new Bar().b());
        System.out.println(new Baz().b());
    }
}
