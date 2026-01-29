public class divisibility {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;   // base case
        }
        return gcd(b, a % b); // recursion
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(gcd(a, b)); // Output: 10
        System.out.println("LCM of this is " + (a*b)/gcd(a, b));
    }
}
