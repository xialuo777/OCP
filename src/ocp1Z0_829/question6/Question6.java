package ocp1Z0_829.question6;

public class Question6 {
    public static void main(String[] args) {
        Product name = new Product(1111, "name");
        int regName = name.getRegName();
        String s = name.pName();
        System.out.println(regName + " " + s);
    }
}

record Product(int pNumber, String pName) {
    static int regNo = 100;

    public int getRegName() {
        return regNo;
    }
}
