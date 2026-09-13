package multithreading.day1;

public class ThreadName_ID {    // Thread Id and Thread name

    public static void main(String[]args){

        System.out.println("Name of Thread is : "+ Thread.currentThread().getName());
        System.out.println("ID of Thread is : "+ Thread.currentThread().getName());
        Thread t1 = new Thread(()->{
            System.out.println("Name of Thread t1 is : "+ Thread.currentThread().getName());
            System.out.println("ID of Thread t1 is : "+Thread.currentThread().getId());
        });

        Thread t2 = new Thread(()->{
            System.out.println("Name of Thread t2 is : "+ Thread.currentThread().getName());
            System.out.println("ID of Thread t2 is : "+Thread.currentThread().getId());
        });
        t1.start();
        t2.start();
    }

}
