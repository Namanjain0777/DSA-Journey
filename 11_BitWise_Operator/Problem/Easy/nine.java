
public class nine {
    public static void main(String[] args) {
        // =========================================
        // UNSIGNED RIGHT SHIFT (>>>) OPERATOR
        // =========================================

        // Rule:
        // >>> shifts bits to the RIGHT
        // Vacated left positions are ALWAYS filled with 0
        //
        // IMPORTANT:
        // >>> does NOT care about the sign bit
        // It treats the number as UNSIGNED

        // ===============================
        // Example 1: Positive number
        // ===============================

        int a = 20;   // Binary: 00000000 00000000 00000000 00010100

        int result1 = a >>> 2;

        // 00010100 (20)
        // >>> 2
        // --------
        // 00000101 (5)

        System.out.println("20 >>> 2 = " + result1); // Output: 5

        // For POSITIVE numbers:
        // >> and >>> behave the SAME

        // ===============================
        // Example 2: Negative number
        // ===============================

        int b = -8;

        // Binary (32-bit, 2's complement):
        // -8 = 11111111 11111111 11111111 11111000

        int result2 = b >>> 1;

        // >>> fills left with 0 (NOT sign bit)
        // Result becomes a LARGE POSITIVE number

        System.out.println("-8 >>> 1 = " + result2);

        // ===============================
        // Comparison: >> vs >>>
        // ===============================

        int rightShift = b >> 1;     // arithmetic right shift
        int unsignedShift = b >>> 1; // logical right shift

        System.out.println("-8 >> 1  = " + rightShift);     // -4
        System.out.println("-8 >>> 1 = " + unsignedShift);  // large positive

        // ===============================
        // INTERVIEW TRAPS
        // ===============================
        // 1. >>> is called LOGICAL RIGHT SHIFT
        // 2. It ALWAYS fills with 0
        // 3. Result of negative numbers becomes positive
        // 4. Used rarely, but important in low-level code

        // ===============================
        // WHEN TO USE >>> ?
        // ===============================
        // - Binary data processing
        // - Hashing algorithms
        // - Bit manipulation where sign must be ignored
    }    
}
