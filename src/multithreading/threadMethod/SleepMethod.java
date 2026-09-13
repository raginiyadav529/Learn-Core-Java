package multithreading.threadMethod;

public class SleepMethod {
    public static void main(String[]args){

        System.out.println("Main thread starts ...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread ends ...");
    }
}

/*
Thread important method
Thread.sleep() --> TIMED_WAITING-->RUNNABLE
 */