package ocp1Z0_829.question34;

public class Question34 {
    public void sum(int a, int b){
        System.out.println("A");
    }
    public void sum(int a, float b){
        System.out.println("B");
    }
    public void sum(float a, float b){
        System.out.println("C");
    }
    public void sum(double... a){
        System.out.println("D");
    }

    public static void make(){
        System.out.println("Make");
    }

    public static void main(String[] args) {
        Question34 question34 = new Question34();
        question34.sum(10, 15.24);
    }
}
