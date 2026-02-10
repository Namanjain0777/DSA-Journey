import java.util.Stack;

public class two {
    public static void main(String[] args) {
        String str = "(()())()]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening bracket available
                if (stack.isEmpty()) {
                    System.out.println("Not balanced");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    System.out.println("Not balanced");
                    return;
                }
            }
        }

        // Final check
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
