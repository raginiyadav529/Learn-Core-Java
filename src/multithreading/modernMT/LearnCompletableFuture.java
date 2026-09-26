package multithreading.modernMT;

import java.util.concurrent.CompletableFuture;

public class LearnCompletableFuture {

    public static void main(String[] args) {

        /*
        // thenApply
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 10)
                .thenApply(integer -> integer * 2)
                .thenApply(integer -> integer * 3);
        try{
            System.out.println(future.get());
        }
        catch (Exception e){
            System.out.println("Exception ...");
        }
         */

        /*
       // thenAccept
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> 10).thenAccept(integer ->
                        System.out.println(integer)
                );
         */

        /* //thenRun
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> 10)
                .thenRun(()-> System.out.println("Accept ..."));
         */

        // thenCombine

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 30);

        CompletableFuture<Void> combine =
                f1.thenCombine(f2, (a, b) -> a + b)
                        .thenAccept(integer -> System.out.println(integer)
                        );
    }
}

// thenApply -->Transform ,return
// thenAccept -  Consumer ,no return


// CompletableFuture --> internally uses Fork join pool Executor