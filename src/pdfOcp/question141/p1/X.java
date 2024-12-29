package pdfOcp.question141.p1;

import java.util.List;

public abstract class X {
    protected final List items;

    protected X(List items) {
        this.items = items;
    }
    protected abstract void doProcess();
    public void removeItem(String item){
        items.remove(item);
    }
}
