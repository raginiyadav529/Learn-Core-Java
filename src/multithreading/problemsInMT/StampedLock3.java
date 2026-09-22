package multithreading.problemsInMT;

import java.util.concurrent.locks.StampedLock;

public class StampedLock3 {
    public static void main(String[]args){

        SharedResource1 sr = new SharedResource1();
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


class SharedResource1 {

    private int value = 0;
    StampedLock lock = new StampedLock();

    public void read(){

    long  stamp = lock.tryOptimisticRead();

    int currentValue;

            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(!lock.validate(stamp)) {  // lock.validate(stamp)== false

                // try pessimistic read
                stamp = lock.readLock();
            }
            try{
              currentValue = value;
            }
            finally {
                lock.unlockRead(stamp);

            }
            System.out.println(Thread.currentThread().getName()+" reads value as : "+currentValue);
    }

    public void write(int newValue){

        long stamp = lock.writeLock();

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
            lock.unlockWrite(stamp);
        }
    }
}
