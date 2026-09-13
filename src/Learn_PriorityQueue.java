import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Learn_PriorityQueue {

      // ******************* Priority Queue **********************
     //       ->  used to use element based on their priority

    public static void main(String []args){

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println("Element : "+pq); // By default MIN_HEAP -->returns smallest element
      int element = pq.poll(); // removes top element
        System.out.println("Removed : "+element); // 12
        System.out.println(pq);
//
        System.out.println("Peek element : "+pq.peek());

        // if we want to return highest element which is 40 in our case then
        // we need to do -> MAX_HEAP --> Comparator.reverseOrder()--> set to MAX_HEAP--> return highest element -->40



    }
}
