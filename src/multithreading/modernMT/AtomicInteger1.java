package multithreading.modernMT;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger1 {

    public static void main(String []args){

        Count c1 = new Count();

        Thread t1 = new Thread(()->{
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count is : "+c1.count);
    }
}

class Count{

    AtomicInteger count = new AtomicInteger(0);
    private final int counter =0;

    public void increment(){

        // Atomic operation
        count.incrementAndGet(); // ++counter

    }
}