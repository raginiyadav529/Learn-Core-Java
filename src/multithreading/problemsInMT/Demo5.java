package multithreading.problemsInMT;

public class Demo5 {

    public static void main(String[]args){

        Counter c1 = new Counter();
        Thread t1 = new Thread(()->c1.count());
        Thread t2 = new Thread(()->c1.count());

        t1.start();
        t2.start();
    }
}

// static synchronization

class Counter {
    static int count = 0;

    static void count() {

        synchronized(Counter.class){

            System.out.println(Thread.currentThread().getName()+" "+"Before count : "+count);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println(Thread.currentThread().getName()+" "+"After count : "+count);
        }


    }

}

/*
 static block -->
       synchronized (Counter.class){

             // code

      }
 */