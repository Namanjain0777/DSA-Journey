// 151. Reverse Words in a String

public class leetcode {
   public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        leetcode solution = new leetcode();
        String s = "  Hello   World  ";
        String result = solution.reverseWords(s);
        System.out.println(result); // Output: "World Hello"
    }
}