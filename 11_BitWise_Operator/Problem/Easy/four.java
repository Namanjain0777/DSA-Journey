
public class four {
    public static void main(String[] args) {
        // ===============================
        // BITWISE NOT (~) OPERATOR
        // ===============================

        // NOT Truth Table (bit-wise):
        // ~0 = 1
        // ~1 = 0
        //
        // Rule:
        // NOT flips EVERY bit (0 -> 1, 1 -> 0)

        int a = 5;   // Binary (32-bit): 00000000 00000000 00000000 00000101

        int result = ~a;

        // After NOT:
        // ~5 = 11111111 11111111 11111111 11111010

        System.out.println("~a = " + result); // Output: -6

        // ===============================
        // WHY RESULT IS NEGATIVE?
        // ===============================
        // Java uses 2's complement to store signed integers
        //
        // Formula to remember:
        // ~n = -(n + 1)

        // Example:
        // ~5 = -(5 + 1) = -6

        // ===============================
        // TIP 1: Clear all bits (be careful!)
        // ===============================
        int x = 0;
        System.out.println("~0 = " + (~x)); // -1 (all bits become 1)

        // ===============================
        // TIP 2: Turn OFF a specific bit using NOT
        // ===============================

        int num = 7;    // Binary: 111
        int k = 1;      // Turn OFF bit at position 1

        // Step 1: Create mask -> (1 << k) = 010
        // Step 2: Flip mask  -> ~(1 << k) = 101
        // Step 3: AND with number
        int turnedOff = num & ~(1 << k);

        //  111
        // &101
        // ----
        //  101 -> 5

        System.out.println("After turning OFF bit " + k + ": " + turnedOff);

        // ===============================
        // IMPORTANT INTERVIEW TIPS
        // ===============================
        // 1. NOT (~) works on ALL bits (32 bits for int)
        // 2. Result is usually negative
        // 3. Use NOT mainly with masks, not alone
        // 4. Remember formula: ~n = -(n + 1)
    }    
}
