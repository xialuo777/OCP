package ocp1Z0_829.question43;

import java.io.Serializable;

public class SoftWare implements Serializable {
    private String title;
    public SoftWare(String title) {
        this.title = title;
        System.out.println("Software");
    }
    public String toString(){
        return title;
    }
}
