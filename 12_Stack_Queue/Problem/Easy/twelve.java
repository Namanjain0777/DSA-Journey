import java.util.Stack;

public class twelve {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(54);
        stack.push(63);
        stack.push(13);
        stack.push(175);
        int size = 0;
        for (Integer val : stack) {
            size++;
        }
        System.out.println("Size: " + size);

    }    
}
