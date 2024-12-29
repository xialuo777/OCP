package pdfOcp.question114;

import java.util.concurrent.*;

public class Question114 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(()-> System.out.println("Ping "));
        Future<String> future = es.submit(()->"Pong");
        System.out.println(future.get());
    }
}
