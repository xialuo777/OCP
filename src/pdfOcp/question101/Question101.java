package pdfOcp.question101;

public class Question101 {
    class L extends Exception{};
    class M extends L{}
    class N extends RuntimeException{};
    public void p() throws L{
        throw new M();
    }
    public void q() throws N{
        throw new N();
    }

    public static void main(String[] args) {
        try {
            Question101 t = new Question101();
            t.p();
            t.q();
        } catch (L e) {
            System.out.println("Exception caught");;
        }
    }
}
