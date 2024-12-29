package pdfOcp.question91;

import java.util.Iterator;
import java.util.List;

public class Question91 {
    {
        Iterator loop = List.of(1,2,3).iterator();
        while (loop.hasNext()) {
            System.out.println(loop.next());;
        }
        Iterator loop2 = List.of(1,2,3).iterator();
        while (loop.hasNext()) {
            System.out.println(loop2.next());;
        }
    }

}
