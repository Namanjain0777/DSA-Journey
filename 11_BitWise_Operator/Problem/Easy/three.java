public class three {
    public static void main(String[] args) {

        // ===============================
        // BITWISE XOR (^) OPERATOR
        // ===============================

        // XOR Truth Table:
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0
        //
        // Rule:
        // Result bit is 1 ONLY if bits are DIFFERENT

        int a = 5;   // Binary: 101
        int b = 3;   // Binary: 011

        int result = a ^ b;

        // Bit-by-bit operation:
        //   101
        // ^ 011
        // -----
        //   110  -> 6

        System.out.println("a ^ b = " + result); // Output: 6

        // ===============================
        // TIP 1: XOR with 0 (Identity)
        // ===============================
        // n ^ 0 = n (number remains unchanged)

        int n = 7;
        System.out.println("n ^ 0 = " + (n ^ 0)); // 7

        // ===============================
        // TIP 2: XOR with itself
        // ===============================
        // n ^ n = 0

        System.out.println("n ^ n = " + (n ^ n)); // 0

        // ===============================
        // TIP 3: Swap two numbers WITHOUT temp variable
        // ===============================

        int x = 4;
        int y = 6;

        // XOR swapping steps
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        // After swap:
        // x = 6, y = 4
        System.out.println("After swap: x = " + x + ", y = " + y);

        // ===============================
        // TIP 4: Find unique element in array
        // ===============================
        // If all elements appear twice except one

        int[] arr = {2, 3, 5, 2, 3};

        int unique = 0;
        for (int val : arr) {
            unique = unique ^ val;
        }

        // All duplicates cancel out (n ^ n = 0)
        // Result = unique element
        System.out.println("Unique element: " + unique); // 5

        // ===============================
        // IMPORTANT INTERVIEW TIP
        // ===============================
        // XOR is:
        // - Commutative
        // - Associative
        // - Reversible
        //
        // These properties make XOR perfect for
        // unique-element and swap problems.
    }
}
