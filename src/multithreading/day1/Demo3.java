package multithreading.day1;

public class Demo3 {

    public static void main(String[]args){

        Thread t1 = new Thread(()->{
            System.out.println("Thread is running ...");
            System.out.println(Thread.currentThread().getName());
        });
        t1.start();
//        t1.start();
//        t1.start();
//        t1.run();  // main thread initial one

    }
}


// start() or run()

// Our OS will only create a thread when we called using start() method.

/*
Can we start() the same thread twice ? --> NO
if we call something like-
        t1.start();
        t1.start();
        t1.start();
this will give IllegalThreadStateException
 */