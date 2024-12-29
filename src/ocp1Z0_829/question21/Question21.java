package ocp1Z0_829.question21;

public class Question21 {
    public static void main(String[] args) {
        Integer rank = 4;
        switch (rank) {
            case 1,4 -> System.out.println("Range1");
            case 5,8 -> System.out.println("Range2");
            case 9,10 -> System.out.println("Range3");
            default -> System.out.println("Not a valid range");
        }

        switch (rank) {
            case 1,4:
                System.out.println("Range 1");
            case 5,8:
                System.out.println("Range 2");
            case 9,10:
                System.out.println("Range 3");
            default:
                System.out.println("Not ");
        }
    }
}
