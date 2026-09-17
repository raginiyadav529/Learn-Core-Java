package multithreading.problemsInMT;

public class Demo3 {

    public static void main(String[]args){

        Test1 test1 = new Test1();
//        Test1 test2 = new Test1();

        Thread t1 = new Thread(()->test1.display1());
        Thread t2 = new Thread(()->test1.display2());

        t1.start();
        t2.start();
    }

}

class Test1{

  public synchronized void display1(){

        System.out.println(" inside display 1");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" exit display 1 block ");
    }

    public synchronized void display2(){
        System.out.println(" inside display 2");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" exit display 2 block");
    }
}

/*
Each object has internal 1 lock, and.


 */
