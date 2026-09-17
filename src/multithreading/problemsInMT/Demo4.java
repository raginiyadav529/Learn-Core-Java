package multithreading.problemsInMT;

public class Demo4 {

    public static void main(String[]args){

        Bank b1 = new Bank();
//        Thread t1 = new Thread(()->b1.deposit());
//        Thread t2 = new Thread(()->b1.withdraw());

        Thread t2 = new Thread(()->b1.display());
        Thread t3 = new Thread(()->b1.display());

//        t1.start();
        t2.start();
        t3.start();

    }
}

class Bank{

   final Object lock1 = new Object();
    final Object lock2 = new Object();  // custom locks
    void deposit() {
        synchronized (lock1){
            System.out.println("Deposit logic !");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception occurred ");
            }
            System.out.println("Exit deposit block !");
        }

    }
    void withdraw() {
        synchronized (lock2) {
            System.out.println("Withdraw logic !");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception occurred ");
            }
            System.out.println("Exit Withdraw block !");
        }
    }

    void display(){

        synchronized (new Object()){

            // both thread enter at the same time because of new Object() ,, each tread come with a new Object .

            System.out.println(Thread.currentThread().getName()+" In Display block");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception occurred ");
            }
            System.out.println(Thread.currentThread().getName()+" Exit display  block !");

        }
    }
}
