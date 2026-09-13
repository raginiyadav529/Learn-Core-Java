package multithreading.day1;

public class Demo{

    public static void main(String[]args){

      MyThread t1 = new MyThread();
      t1.start();
      System.out.println(Thread.currentThread().getName());
      System.out.println("Hello ");

    }
}
class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running ...");
    }
}

/*
t1.start() --> JVM asks OS to create a new thread -->Thread gets Stack/PC space -->
Thread execute run()

*/
