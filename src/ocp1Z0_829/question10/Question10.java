package ocp1Z0_829.question10;

public class Question10 {
    void print(int i){
        System.out.println("hello");
    }
    void print(long j){
        System.out.println("three");
    }

    public static void main(String[] args) {
        int i = 0b1101_1010;
        new Question10().print(0b1101_1010);
    }
}
