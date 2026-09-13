package multithreading.threadMethod;

public class IsAliveMethod {

    public static void main(String[]args) throws InterruptedException {

        Thread t1 = new Thread(()->{

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred !");
            }
        });

        System.out.println(t1.isAlive());   // false
        t1.start();
        System.out.println(t1.isAlive());   // true

        Thread.sleep(3000);

        System.out.println(t1.isAlive());  // false
    }
}


/*

    isAlive() --> start - terminate
    checks a thread is Alive or not .

  //  Thread alive between start to terminate

*/
