package multithreading.problemsInMT;

public class Demo {
    public int count =0;

    public static void main(String[]args) throws InterruptedException {

        Demo d1 = new Demo();
        Thread t1 = new Thread(()->{

            for (int i = 1; i <=10000; i++) {
//                System.out.println("T1 is running: "+i);
                d1.increment();

            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 1; i <=10000; i++) {
//                System.out.println("T2 is running: "+i);
                d1.increment();

            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Total count is : "+d1.count);

    }


   /* synchronized   void increment (){  // critical section
        count ++;
    }
*/

    void increment (){  // critical section

        // synchronized block
        synchronized (this){  //  this points to current object .
            count ++;
        }
    }

}
/*
increment () --> critical section

count -> shared resource

--> Without synchronized ---> occur Race condition


--> With synchronized ---->
  Using synchronized keyword only 1 thread can enter the critical section ,
  and it may stop the problem of Race Condition.

--> We can be also used synchronized block to make only
   a particular line of code synchronized .
    synchronized block --->
                       synchronized (this){
                                count ++;
                        }
 */




