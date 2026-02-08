import java.util.Queue;
import java.util.LinkedList;

public class eighteen {
    public static void main(String[] args) {
        // Create Queue using Queue interface
        Queue<Integer> queue = new LinkedList<>();
        // ENQUEUE (add elements at REAR)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue: " + queue);
        // DEQUEUE (remove element from FRONT)
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after dequeue: " + queue);
        // PEEK / FRONT (view front element without removing)
        System.out.println("Front element: " + queue.peek());
        // CHECK if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
        // SIZE of queue
        System.out.println("Queue size: " + queue.size());
    }
}
