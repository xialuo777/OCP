package pdfOcp.question108;

public class Question108 {
    int a;
    int t;
    int c;
    int g;
    public Question108(int a, int t, int c, int g) {
        this.a = a;
        this.t = t;
        this.c = c;
        this.g = g;
    }
    int getA(int a){
        return a;
    }

    int getT(int t){
        return this.t;
    }
    int getC(){
        return getCount()-this.a-getT(0)-g;
    }
//    int getG(){
//        return getG();
//    }
    int getCount(){
        return a+getT(0)+this.c+this.g;
    }

    public static void main(String[] args) {
        Question108 q = new Question108(1,2,3,4);
        System.out.println(q.getA(0));
        System.out.println(q.getT(0));
        System.out.println(q.getC());
        System.out.println(q.getCount());
//        q.getG();
        System.out.println("end");
    }
}
