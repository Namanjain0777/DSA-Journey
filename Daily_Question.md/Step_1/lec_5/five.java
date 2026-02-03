// Reverse a string using recursion
public class five {
    public static String reverseString(String str, int index) {
        if (index == 0) {
            return Character.toString(str.charAt(index));
        }
        char currentChar = str.charAt(index);
        return currentChar + reverseString(str, index - 1);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String reversedStr = reverseString(str, str.length() - 1);
        System.out.println(reversedStr);
    }
}
