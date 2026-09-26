package multithreading.modernMT;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class LearnForkJoinExecutor {

    public static void main(String[]args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        SumTask task = new SumTask(arr , 0, arr.length-1);

        ForkJoinPool pool = new ForkJoinPool();

        int result = pool.invoke(task);
        System.out.println(result);
        pool.shutdown();

    }
}

class SumTask extends RecursiveTask<Integer> {

    private final int[] arr;
    private final int start;
    private final int end;

    public SumTask(int [] arr , int start , int end) {

        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        // Base condition
        if(end-start <= 2){
            int sum =0;
            for (int i = start; i <= end ; i++) {

                sum+=arr[i];
            }
            return sum ;
        }

        // main logic -> divide(fork)  leftTask -> (start, mid) ,,,,, RightTask -> (mid+1 , end)

        int mid = (start + end) / 2;

        SumTask leftTask = new SumTask(arr , start , mid);
        SumTask rightTask = new SumTask(arr , mid+1 , end);

        leftTask.fork();  // put it inside Stealing Queue
       int sum1 = rightTask.compute();
       int sum2 =  leftTask.join();

       // join
        return sum1+sum2;
    }
}