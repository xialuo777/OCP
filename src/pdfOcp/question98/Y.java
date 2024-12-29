package pdfOcp.question98;

import java.util.HashMap;
import java.util.Map;

public class Y extends X {
    public void set(Map<String, String> map) {
//        super.set(map.values());
        set(map.values());
//        set(map);
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.set(new HashMap<String, String>());

        int x = 3;
        Integer z = 3;
        System.out.println(x * 3 + z * 3);
    }
}
