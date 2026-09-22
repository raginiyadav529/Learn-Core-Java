package multithreading.problemsInMT;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {

    public static void main(String[] args){

        Resource r1 = new Resource();

        Thread t1 = new Thread(()->r1.display());
        Thread t2 = new Thread(()->r1.display());
        Thread t3 = new Thread(()->r1.display());

        t1.start();
        t2.start();
        t3.start();
    }
}

class Resource {

    Lock lock = new ReentrantLock();

    void display(){

        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " Entered !");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " Exit !");
        }
        finally {
            lock.unlock();
        }
    }
}

/**
 *  using lock.lock() it can still behave like critical section but don't forget to
 *  invoke lock.unlock() method , otherwise our occupied lock not release.
 *
 *  we call unlock() method to release lock after our job is done .
 *  if we call unlock() without occupying lock then it will throw an IllegalMonitorStateException .
 */