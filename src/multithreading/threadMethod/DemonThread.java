package multithreading.threadMethod;

public class DemonThread {

    public static void main(String[]args){

        Thread t1 = new Thread(()->{
           while(true){
               System.out.println("Running ...");
           }
        });

        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(1000);  // 1 sec
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

/*

   Daemon Threads --> Background running threads
   --> Stop immediately once main thread is completed

   Threads --> User threads, Daemon threads

    Garbage collection --> Daemon thread
*/