package multithreading.problemsInMT;

public class Demo2 {

    public static void main(String [] args) {

        Test test1 = new Test();

        Thread t1 = new Thread(()->test1.show(),"T1-thread");
        Thread t2 = new Thread(()->test1.show(),"T2-thread");

        t1.start();
        t2.start();

    }
}

class Test {

   synchronized public void show(){

        System.out.println(Thread.currentThread().getName()+" Inside show ");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+" Outside show ");

    }
}
