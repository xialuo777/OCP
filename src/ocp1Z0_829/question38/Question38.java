package ocp1Z0_829.question38;

import java.util.ArrayList;
import java.util.List;

public class Question38 {
    String non = "nonStatic";
    public String attach1(List<String> data){
        String w = data.parallelStream().reduce("w", (x, y) -> x + y);
        return data.parallelStream().reduce("w",(n,m)->n+m, String::concat);
    }
    public String attach2(List<String> data){
        return data.parallelStream().reduce((l,p)->l+p).get();
    }
    public static void main(String[] args) {
        Question38 q = new Question38();
        var list = List.of("Table", "Chair");
        String x = q.attach1(list);
        String s = q.attach2(list);
        System.out.println(x+" "+s);

        var l = new ArrayList<>();
        l.add(10);
        l.add("20");
        System.out.println(l);
    }

 
}
