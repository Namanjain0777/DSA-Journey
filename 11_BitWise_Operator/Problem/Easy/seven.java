
public class seven {
    public static void main(String[] args) {
        // =========================================
        // LEFT SHIFT (<<) OPERATOR
        // =========================================

        // Rule:
        // Left shift moves bits to the LEFT
        // Vacated right positions are filled with 0
        //
        // Effect:
        // n << k  = n * (2^k)

        int a = 5;   // Binary: 00000101

        int result = a << 1;

        // Step-by-step:
        // 00000101  (5)
        // << 1
        // --------
        // 00001010  (10)

        System.out.println("5 << 1 = " + result); // Output: 10

        // ===============================
        // TIP 1: Multiply using left shift
        // ===============================

        int x = 7;
        int multiplyBy2 = x << 1;  // x * 2
        int multiplyBy4 = x << 2;  // x * 4

        System.out.println("7 * 2 = " + multiplyBy2);
        System.out.println("7 * 4 = " + multiplyBy4);

        // ===============================
        // TIP 2: Create bit masks
        // ===============================

        int k = 3;

        // 1 << k creates a mask with only kth bit set
        int mask = 1 << k;

        // 1 << 3 = 00001000
        System.out.println("Mask for bit " + k + ": " + mask);

        // ===============================
        // INTERVIEW TRAP
        // ===============================
        // Left shift does NOT rotate bits
        // Bits shifted out from left are LOST
        // Always fills 0 on the right

        // ===============================
        // IMPORTANT INTERVIEW NOTES
        // ===============================
        // 1. Works on signed integers
        // 2. Can cause overflow
        // 3. Faster than multiplication in low-level operations
    }    
}
