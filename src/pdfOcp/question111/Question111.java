package pdfOcp.question111;

public class Question111 {
    public static void main(String[] args) {
        Module module = Question111.class.getModule();
        System.out.println("Module: " + module);
        System.out.println("Module Name:" + module.getName());
        System.out.println("Description:" + module.getDescriptor());
    }
}
