package multithreading.day1;

public class Demo2 {

    public static void main(String[]args){

        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1,"Thread-t1");  // Task & Thread combined(coupled)
        Thread t3 = new Thread(r1,"Thread-t3");

        Thread t2 = new Thread(()->{
            System.out.println("t2 Thread is running ...");
            System.out.println(Thread.currentThread().getName());
        },"Thread-t2");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName()); // main thread

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Task is Running ...");
        System.out.println(Thread.currentThread().getName());
    }
}
