package multithreading.modernMT;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferencePractice1 {

    public static void main(String []args){

        LikeCounter counter = new LikeCounter();

        Thread t1 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t2 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t3 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t4 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t5 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t6 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t7 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t8 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t9 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        Thread t10 = new Thread(()->{

            for (int i = 1; i <= 10; i++) {
                counter.like();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Total likes : "+ counter.display());
    }
}

class LikeCounter{

    AtomicReference<Integer> totalCount = new AtomicReference<>(0);

    public void like(){



        Integer finalCount;
        Integer currentCount;
        while (true){
            // 1. We will capture the lastest value of totalCount
             currentCount = totalCount.get();

            //2. Increment like counter by 1
            finalCount = currentCount +1;

            // 3. check again if the count is still what I saw
            if (totalCount.compareAndSet(currentCount, finalCount)){

                return;
            }
            // 4. if a thread is reaches here ,it means someone else must have updated the counter value
            // Re-try
            System.out.println("Conflict detected. Retrying ... ");
        }
    }
    public int display(){

        return totalCount.get();
    }
}

/**
 *
 * CAS - compareAndSet --> used to avoid Race condition , without using locking mechanism .
 *
 */

/*
   We  can also do same task using  AtomicInteger -->incrementAndGet() method .

   AtomicInteger totalCount = new AtomicInteger(0);
   totalCount.incrementAndGet();
 */