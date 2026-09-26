package multithreading.modernMT;

import java.util.concurrent.atomic.AtomicReference;

        // IMP ***** Compare and Set(CAS) operation *****
       //***  CAS -->  Atomic operation ***

public class AtomicReference2 {

    public static void main(String [] args){

        SeatBooking sb = new SeatBooking();

//        Thread t1 = new Thread(()->sb.bookSeat("Ragini"));
//        Thread t2 = new Thread(()->sb.bookSeat("Yadav"));

       Thread t1 = new Thread(()->{
           boolean value = sb.bookSeat("Ragini");
           System.out.println("T1 says : "+value);
       });

        Thread t2 = new Thread(()->{
            boolean value = sb.bookSeat("Yadav");
            System.out.println("T2 says : "+value);
        });
        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Name of seat owner is : "+sb.seat);
    }
}

class SeatBooking{

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name){

        String currentValue = seat.get();
        if (!currentValue.equals("EMPTY")){

            return false ;
        }
        return seat.compareAndSet("EMPTY",name);
    }
}

/*
-->   without CAS Non-Atomic operation -->
class SeatBooking{

    String seat = new String("EMPTY");
    boolean bookSeat(String name){

        if(seat.equals("EMPTY")){
            seat = new String(name);
            return true;
        }
        return false;
    }
}
 */