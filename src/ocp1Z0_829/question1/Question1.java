package ocp1Z0_829.question1;

import java.util.concurrent.atomic.AtomicInteger;

public class Question1 {
    public static void main(String[] args) {
        A a = new A();
        Runnable r1 = ()->{
            Thread thread = Thread.currentThread();
            while (a.x<10){
                System.out.print(thread.getName()+":"+a.x+":");
                a.x++;
            }
        };
        Runnable r2 = ()->{
            Thread thread = Thread.currentThread();
            while (a.xObj.get()<10){
                System.out.print(thread.getName()+":"+a.xObj.get()+":");
                a.xObj.getAndIncrement();
            }
        };
        Thread t1 = new Thread(r1, "t1");
        Thread t2 = new Thread(r2, "t2");
        t1.start();
        t2.start();
    }
}


class A{
    volatile int x = 1;
    AtomicInteger xObj = new AtomicInteger(1);
}