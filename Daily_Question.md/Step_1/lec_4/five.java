/*
 * Theory — Trailing zeros in n! (brief):
 * - A trailing zero comes from a factor 10 = 2 * 5.
 * - In n!, there are always more factors of 2 than 5, so the number of
 *   trailing zeros is determined by the number of times 5 appears in the
 *   prime factorization of all numbers from 1 to n.
 * - Count contributions from multiples of 5, 25 (5^2), 125 (5^3), ...
 *   i.e. sum floor(n/5) + floor(n/25) + floor(n/125) + ... until the power
 *   exceeds n.
 *
 * Complexity: O(log_5 n) time, O(1) space.
 * Example: For n=25 -> 25/5 = 5, 25/25 = 1 => total 6 trailing zeros.
 */

// Count trailing zeros in factorial of a number with inline comments
public class five {
    // returns number of trailing zeros in n!
    public static int countTrailingZeros(int n) {
        int count = 0;
        // iterate over powers of 5: 5, 25, 125, ...
        for (int i = 5; i <= n; i *= 5) {
            // each n / i adds how many numbers contribute at least one more factor of 5
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        // sample inputs and demonstration
        int[] tests = {0, 4, 5, 10, 25, 100};
        for (int n : tests) {
            System.out.println("Trailing zeros in " + n + "! is: " + countTrailingZeros(n));
        }
    }
}