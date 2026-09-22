package multithreading.problemsInMT;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

         // Reader-Writer a classical Problem --> solution

public class ReadWriteLock2 {

    public static void main(String []args){

        SharedResource sr = new SharedResource();
        Thread r1 = new Thread(()->sr.read());
        Thread r2 = new Thread(()->sr.read());
        Thread r3 = new Thread(()->sr.read());

        Thread w1 = new Thread(()->sr.write(5));
        Thread w2 = new Thread(()->sr.write(9));
        Thread w3 = new Thread(()->sr.write(7));

        r1.start();
        r2.start();
        r3.start();
        w1.start();
        w2.start();
        w3.start();
    }
}

class SharedResource{

   private int value = 0;
   ReadWriteLock lock = new ReentrantReadWriteLock();
   Lock rl = lock.readLock();   // shared lock
   Lock wl = lock.writeLock(); //  exclusive lock

  public int read(){

      rl.lock();
      try{
          try{
              Thread.sleep(2000);
          }
          catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          System.out.println(Thread.currentThread().getName()+" reads value as : "+value);
          return value;
      }
      finally {
          rl.unlock();
      }
  }

  public void write(int newValue){

      wl.lock();
      try{
          try{
              Thread.sleep(1000);
          }
          catch (InterruptedException e) {
              throw new RuntimeException(e);
          }

          value = newValue;
          System.out.println(Thread.currentThread().getName()+" writes value as : "+value);
      }
      finally {
          wl.unlock();
      }
  }
}
