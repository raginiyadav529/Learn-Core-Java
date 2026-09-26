package multithreading.modernMT;

import java.util.List;
import java.util.concurrent.*;

public class Executor02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> callableList = List.of(
                ()->10,()->20,
                ()->30,
                ()->40,
                ()->50,
                ()->60,
                ()->70,
                ()->80
        );

        List<Future< Integer>> futures =
                executorService.invokeAll(callableList);

        for (int i =0; i<futures.size();i++){

            System.out.println(futures.get(i).get());
        }
        executorService.shutdown();

     /*
        // Future and callable
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = executor.submit(()->{

            Thread.sleep(1000);
            return 10 ;
        });

        System.out.println(f1.get());
        executor.shutdown();
        */

    }
}
