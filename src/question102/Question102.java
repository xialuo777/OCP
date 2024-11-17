package question102;

import java.util.Stack;

public class Question102 {
    static String prefix = "Mondial:";
    private String name = "domainmodel";
    public static String getName(){
        return new Question102().name;
    }

    public static void main(String[] args) {
        Question102 q = new Question102();
        System.out.println(Question102.prefix + Question102.getName());
        System.out.println(new Question102().prefix + new Question102().name);
    }
}
