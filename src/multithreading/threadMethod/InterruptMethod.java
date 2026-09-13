package multithreading.threadMethod;

public class InterruptMethod {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            int i=1;
            while(!Thread.currentThread().isInterrupted()) {

                System.out.println("Running : "+i);
                i++;
            }
        });
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();

    }
}

/*
    Thread --> interrupt flag (default false) ,,, after calling interrupt() method interrupt flag becomes true

    t1.interrupt() --> Sends a signal to t1 thread that it should stop doing what its doing.

    We can gracefully handle
    --> You can make a thread run until a condition
    --> Cancelling a long-running task
    --> used to stop Thread pool

    isInterrupted() --> return interrupt flag value (T/F)
    interrupted() --> return interrupt flag value (T/F) but also set it back to false

    -> sleep(), join(), wait() : TIMED_WAITING, WAITING --> interrupt()



*/