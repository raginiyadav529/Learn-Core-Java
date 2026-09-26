package multithreading.modernMT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {

    public static void main(String [] args){

        /*
        Thread t1 = Thread.startVirtualThread(()->{

            System.out.println(Thread.currentThread()+" says hello ...");
        });
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */

        ExecutorService executor =
                Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 5 ; i++) {

            executor.submit(()->{

                    System.out.println("Task executed by : "+Thread.currentThread());
                }
            );
        }
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getState() + " "+Thread.currentThread().getName());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
