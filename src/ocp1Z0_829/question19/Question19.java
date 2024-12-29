package ocp1Z0_829.question19;

public class Question19 {
    public static void main(String[] args) {
        String a = "Hello! Java";
        System.out.println(a.indexOf("Java"));
        String replace = a.replace("Hello!", "Welcome!");
        System.out.println(replace.indexOf("Java"));
    }
}
