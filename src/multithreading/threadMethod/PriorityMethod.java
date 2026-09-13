package multithreading.threadMethod;

public class PriorityMethod {

    public static void main(String[]args){

        Thread t1 = new Thread(()->{

            System.out.println("T1 is running ...");
            System.out.println(Thread.currentThread().getName());
        });

        t1.setName("worker-1");
//        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("T2 is running ...");
        });

        Thread t3 = new Thread(()->{
            System.out.println("T3 is running ...");
        });

        t2.start();
        t3.start();

        t2.setPriority(10);
        System.out.println(t2.getPriority());

    }



}

/*
    currentThread() --> reference of current running thread
*/

/*
    In java Thread has something called Thread Priority,,,,, these are integer value
       Thread Priority -->
                           MAX_PRIORITY = 10
                           MIN_PRIORITY = 1
                           NORM_PRIORITY = 5
    Depends on OS
    -> may respect Priority
    -> may partially respect
    -> may not at all


*/