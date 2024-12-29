package pdfOcp.question71;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question71 {
    public static void main(String[] args) {
        var c = new CopyOnWriteArrayList<>(List.of("1", "2", "3", "4"));
        Runnable r = () -> {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            c.set(3, "four");
            System.out.print(c + " ");
        };

        Thread t = new Thread(r);
        t.start();
        for (var s : c) {
            System.out.print(s + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
