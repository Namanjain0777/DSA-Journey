import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addLast(1);
        System.out.println(deque);
    }
}
