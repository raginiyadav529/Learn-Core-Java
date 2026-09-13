import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Learn_ArrayDeque {


    public static void main(String[]args){

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offer(20);
        System.out.println("before : "+adq);
        adq.offerFirst(30);
        System.out.println("element : "+adq);

        adq.offerLast(25);
        System.out.println("element : "+adq);

        System.out.println("Peek :"+  adq.peek());
        System.out.println("Peek First :"+  adq.peekFirst());
        System.out.println("Peek Last :"+  adq.peekLast());

        System.out.println(adq);  // 30,10,20,25

        System.out.println("Poll :"+  adq.poll()); // 30
        System.out.println(adq);
        System.out.println("Poll First :"+  adq.pollFirst()); // 30
        System.out.println(adq);
        System.out.println("Poll Last :"+  adq.pollLast());  // 25
        System.out.println(adq);


    }
}

/*
            ************************  Array Dequeue ******************
  ->   Dequeue means - Double ended  Queue
    ------> We can insert and delete element from both end (frontEnd & RearEnd)
 -> offer() -> add element at the last position ,,,,
 *             method of Queue interface and implemented by ArrayDequeue .

* offerFirst() -> add element at the first position,,, offerFirst () is a method
*                of ArrayDequeue class and is implemented by ArrayDequeue.

* offerLast() -> similarly -> Works as offer(), offerLast() insert element at the last position
*                 method of ArrayDequeue class .

* peek() ,peekFirst() -> returns top of the element .
* peekLast() -> returns last of the element .

*  poll() , pollFirst() -> removes top of the element .
* pollLast() -> removes last of the element .

*
*/