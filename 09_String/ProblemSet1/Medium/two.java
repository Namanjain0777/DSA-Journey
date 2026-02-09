import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Balla balla shaba shaba");
        int[] freq = new int[26];

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        System.out.println(Arrays.toString(freq));
    }
}
// “I use a frequency array of size 26 and map characters using ch - 'a' to count occurrences efficiently in O(n) time.”
// Time: O(n)
// Space: O(1)