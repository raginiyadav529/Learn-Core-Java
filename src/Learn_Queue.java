import java.util.LinkedList;
import java.util.Queue;

public class Learn_Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue element is : "+queue);
//         int remove = queue.poll();
        System.out.println("Removed : "+queue.poll());
        System.out.println(queue);

         int top = queue.peek();
        System.out.println("Top : "+top);



    }
}
