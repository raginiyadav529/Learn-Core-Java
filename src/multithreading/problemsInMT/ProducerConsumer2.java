package multithreading.problemsInMT;

public class ProducerConsumer2 {

    //   problem

    public static void main(String[] args){

        Box1 b1 = new Box1();

        Thread t1 = new Thread(()->{
            for (int i=1 ;i<= 20;i++){

                try{
                    Thread.sleep(100);
                }
                catch(Exception e) {}

                b1.producer(i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=1 ;i<= 20;i++){

                try{
                    Thread.sleep(70);
                }
                catch(Exception e) {}

                b1.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}

class Box1 {

    volatile Integer item ;
    volatile Boolean flag = false;

    synchronized void producer(int value){

        while (flag == true){
            // do nothing
        }
        item = value;
        flag = true;

        System.out.println("Producer produces " + item);
    }

    synchronized void consumer(){

        while (flag == false){

            // do nothing

            item = null;
            flag = false;
            System.out.println("Consumer consumes " + item);
        }
    }

}
