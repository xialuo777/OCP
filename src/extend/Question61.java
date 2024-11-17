package extend;

import java.util.ArrayList;
import java.util.List;

public class Question61 <T extends Worker> {
    private List<T> processes = new ArrayList<>();
    public void addProcess(T w){
        processes.add(w);
    }

    public void run(){
        processes.forEach((p)->p.doProcess());
    }
}
