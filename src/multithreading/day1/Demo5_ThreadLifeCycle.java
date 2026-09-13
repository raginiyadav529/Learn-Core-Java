package multithreading.day1;

public class Demo5_ThreadLifeCycle {

    public static void main(String[] args){

        Thread mainThread = Thread.currentThread(); //  return current thread

        // Thread new stage

        Thread t1 = new Thread(()->{
            System.out.println("Name of current Thread is : "+Thread.currentThread().getName());
            System.out.println("Main Thread state : "+ mainThread.getState());
        });

        System.out.println(t1.getState()); // NEW

        //Runnable stage

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
        System.out.println(t1.getState()); // RUNNABLE

        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//
            System.out.println(t1.getState()); // TERMINATED

    }
}
