public class Hashing {

    public static void freq(String s) {
        int[] freq = new int[26];

        s = s.toLowerCase(); // normalize

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {   // ignore spaces/symbols
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        freq("Naman Jain");
    }
}
