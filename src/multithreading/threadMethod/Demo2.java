package multithreading.threadMethod;

public class Demo2 {

    public static void main(String[]args) throws InterruptedException {

        System.out.println("Main thread starts ...");

        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(()->{ // We're coupling task with thread mechanism.
            try {
                Thread mainThread1 = Thread.currentThread();
                Thread.sleep(2000);
                System.out.println("Main thread state : "+ mainThread.getState());
                System.out.println("T1 thread state : "+ mainThread1.getState());

            }
            catch(InterruptedException e) {}
            System.out.println("Thread t1 is running ...");
            System.out.println(Thread.currentThread().getName());
        },"Thread-t1");

        t1.start();
        System.out.println("t1 state "+t1.getState());  // RUNNABLE
        t1.join();  // --> let the t1 thread first complete its execution
//      t1.join(1000);  //wait for t1 for 1000ms(1sec) if t1 is not ready to run then proceed other/main thread

        System.out.println("Main thread ends ...");
    }
}
/*
  join() method
 t1.join();  WORKING -->
                        -> Main thread --> WAITING STATE
                        -> t1 thread --> RUNNABLE --> TERMINATED
                        -> Main thread --> WAITING -> RUNNABLE --> TERMINATED

      t1.join()     --> WAITING STATE
      t1.join(time) --> TIMED-WAITING STATE
*/

/*
t1.join() means: "Whoever calls this (the current thread, i.e. main) will wait until t1 finishes."

So:

        t1.join() → main blocks until t1 dies (prints "Thread t1 is running..." first).

        t1.join(1000) → main blocks for at most 1000ms waiting for t1 to finish.

If t1 finishes within 1000ms → main resumes immediately.

If not → after 1000ms main resumes anyway, even if t1 is still running.

 */
