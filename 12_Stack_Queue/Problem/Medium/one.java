import java.util.Stack;

public class one {
    public static void main(String[] args) {
        String str = "Arun";
        str.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<str.length() ; i++){
            Character ch = str.charAt(i);
            stack.addFirst(ch);
        }
        System.out.println(stack.toString());
    }
}

