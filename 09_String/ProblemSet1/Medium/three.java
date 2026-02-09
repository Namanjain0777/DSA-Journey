import java.util.HashSet;

public class three {
    public static void main(String[] args) {
        String s = "Hello Naman";
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
