package pdfOcp.question126;

public class Question126 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        thread1.start();
        thread2.run();
        thread3.start();
        thread1.start();
    }
}
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Thread");
    }
}
