package multithreading.modernMT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor01 {

    public static void main(String [] args){

                // Thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

         // number of task = 5
        for (int i = 1; i <= 5; i++) {

            int finalI = i;
            executor.execute(()->{
                System.out.println("Task "+ finalI + " is performed by "+
                        Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

/*
   execute(Runnable's object), Runnable -> Functional interface -> one abstract method

ExecutorService executor = Executors.newFixedThreadPool(2); -->
       ExecutorService -> interface , executor -> reference ,
       Executors -> utility class , newFixedThreadPool() -> Type of ThreadPool .

   It means we are creating a thread pool , and we'll pass our task (Runnable)
   to executor.execute();
 */

/*
execute - Runnable
submit  - Callable , r
 */
