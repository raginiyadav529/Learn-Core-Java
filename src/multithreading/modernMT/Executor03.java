package multithreading.modernMT;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor03 {

    public static void main(String [] args){

        ExecutorService executor = Executors.newFixedThreadPool(3);

//        try {
//            executor.execute(()->{
//                int x = 10/0;
//            });
//        }
//        catch (Exception e){
//
//            System.out.println(" execute() exception !!!");
//        }

        Future<Integer>  future = executor.submit(()->{

            return(  10 / 0);
        });

        try {
            System.out.println(future.get());
        }
        catch (ExecutionException e) {
            System.out.println("Exception 1 ");
        } catch (InterruptedException e) {
            System.out.println("Exception 2 ");
        }

    }
}
