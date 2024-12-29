package ocp1Z0_829.question37.p1;

public sealed class Doc permits WordDoc {
    public void make(){
        System.out.println("Make");
    }

    private String name;
    public Doc(String name){
        this.name = name;
        System.out.println("Create Doc");
    }
}
