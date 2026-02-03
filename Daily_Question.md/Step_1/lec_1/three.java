public class three {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false; 
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }

    public static void main(String[] args) {
        int[] tests = {121, 1212, -121, 10, 0, 12321};
        for (int n : tests) {
            System.out.println(n + " -> " + three.isPalindrome(n));
        }
    }
}