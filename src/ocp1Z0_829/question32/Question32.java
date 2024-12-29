package ocp1Z0_829.question32;

public class Question32 {
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.display("Flower");

    }
}

class Item{
    static String name;
    public static void display(){
        name = "Vase";
        System.out.println(name);
    }

    public void display(String design){
        this.name += name;
        System.out.println(name);
    }
}
