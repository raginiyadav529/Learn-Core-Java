package multithreading.problemsInMT;

public class ProducerConsumerSolution {

    public static void main(String[]args){

        Box3  b3 = new Box3();
        Thread t1 = new Thread(()->{
            for (int i = 1; i <= 20; i++) {

                try {
                    Thread.sleep(100);
                    b3.producer(i);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 20; i++) {

                try {
                    Thread.sleep(100);
                    b3.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class Box3 {

    volatile Integer item ;
    volatile Boolean flag = false ;

    synchronized void producer(int value ) throws InterruptedException {

        while (flag == true){

            wait();
        }
        item = value;
        flag = true;
        System.out.println("Producer produces "+item);
        notify();
    }

    synchronized void consumer() throws InterruptedException {

        while (flag == false){

            wait();
        }
        System.out.println("Consumer consumes "+item);
        flag = false;
        item = null;
        notify();
    }
}



/**
 * Thread t1 = new
 */