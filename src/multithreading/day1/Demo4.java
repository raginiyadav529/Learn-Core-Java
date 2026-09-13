package multithreading.day1;

public class Demo4 {

    public static void main(String[] args){

        // 1 to 100 --> Even number
        Thread t1 = new Thread(()->{
           for (int i=1; i<=100;i++){
               if (i % 2 == 0){
                   System.out.println("T1 : "+i);
               }
           }
        });
        // 1 to 100 --> Odd number
        Thread t2 = new Thread(()->{
            for (int i=1; i<=100;i++){
                if (i % 2 != 0){
                    System.out.println("T2 : "+i);
                }
            }
        });

        Thread t3 = new Thread(() ->{
            System.out.println("Thread 3  running ...");
        },"Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*

// Execution order --> Non determinism

it means any thread can run --> order is not fixed , we cannot determine
which thread is running or going to run, Operating system (OS)Schedular or
JVM Schedular assign thread to CPU to execute(run).
 */