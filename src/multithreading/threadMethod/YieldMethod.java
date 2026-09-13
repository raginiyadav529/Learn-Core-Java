package multithreading.threadMethod;

public class YieldMethod {

    public static void main(String[]args){

        Thread t1 = new Thread(()->{
            for (int i = 1; i <=10; i++) {
                System.out.println("T1 : "+i);
                Thread.yield();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 1; i <=10; i++) {
                System.out.println("T2 : "+i);
            }
        });

        t1.start();
        t2.start();
    }
}


/*

Thread.yield() --> I am willing to give my CPU time to someone else with same priority and
that wants to run

1. OS can reject this.

2. It is like a suggestion to the OS

3. Current thread does not go to WAITING, TIMED_WAITING, BLOCKED.
   It does go to only RUNNABLE state

*/
