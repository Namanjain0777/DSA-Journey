import java.util.ArrayDeque;

public class seven {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.add(85);
        deque.add(65);
        deque.add(32);
        deque.add(54);
        System.out.println("Deque: "+ deque);
        deque.removeLast();
        System.out.println("Remove: "+ deque);
        System.out.println("Peek: "+ deque.peek());

    }    
}

// Code to interface, not implementation
// We use Deque as the reference type because it provides flexibility.
// The implementation can be changed later without affecting the rest of the code.
// Both create the same object, but using the interface type Deque provides better flexibility and follows object-oriented design principles.
