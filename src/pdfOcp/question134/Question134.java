package pdfOcp.question134;

public class Question134 extends A{
    @Override
    void print() {
        System.out.println("Derived class");
    }

    public static void main(String[] args) {
        Question134 question134 = new Question134();
        A question135 = question134;
        question134.print();
//        Question134 a = new A();   尽可向上转型
//        a.print();
    }
}

