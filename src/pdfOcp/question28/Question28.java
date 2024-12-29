package pdfOcp.question28;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Question28 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
            System.out.println(list);
        });
        IntStream.range(0, 5).forEach(i -> executorService.execute(() -> {
            try{
                list.add(i);
                cyclicBarrier.await();
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));
        executorService.shutdown();

    }
}