
public class eight {
    public static void main(String[] args) {
        // =========================================
        // RIGHT SHIFT (>>) OPERATOR
        // =========================================

        // Rule:
        // Right shift moves bits to the RIGHT
        // Vacated left positions are filled with:
        // → SIGN BIT (0 for positive, 1 for negative)
        //
        // Effect:
        // n >> k = n / (2^k)   (for positive numbers)

        int a = 20;   // Binary: 00010100

        int result = a >> 2;

        // Step-by-step:
        // 00010100  (20)
        // >> 2
        // --------
        // 00000101  (5)

        System.out.println("20 >> 2 = " + result); // Output: 5

        // ===============================
        // TIP 1: Divide using right shift
        // ===============================

        int x = 16;
        int divideBy2 = x >> 1;  // x / 2
        int divideBy4 = x >> 2;  // x / 4

        System.out.println("16 / 2 = " + divideBy2);
        System.out.println("16 / 4 = " + divideBy4);

        // ===============================
        // SIGN BIT BEHAVIOR (IMPORTANT)
        // ===============================

        int negative = -8;

        // Binary (2's complement):
        // -8 = 11111000

        int negResult = negative >> 1;

        // Right shift fills left with 1 (sign bit)
        System.out.println("-8 >> 1 = " + negResult); // Output: -4

        // ===============================
        // INTERVIEW TRAPS
        // ===============================
        // 1. Right shift preserves SIGN
        // 2. Bits shifted out on right are LOST
        // 3. NOT same as unsigned right shift (>>>)

        // ===============================
        // IMPORTANT INTERVIEW NOTES
        // ===============================
        // >> is called Arithmetic Right Shift
        // It maintains number sign
    }    
}
