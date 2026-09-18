
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args){
        Queue <Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue:" + queue);
        System.out.println("Front element:" + queue.peek());
        System.out.println("Removed:" + queue.poll());
        System.out.println("Queue after removal:" + queue);
        System.out.println("size:" + queue.size());
    }
}
