
public class six {
    public static void main(String[] args) {
        // =========================================
        // BITWISE OR (|) vs LOGICAL OR (||)
        // =========================================

        // -----------------------------------------
        // 1️⃣ BITWISE OR (|)
        // -----------------------------------------
        // • Works on BITS (0s and 1s)
        // • Can also work on booleans
        // • NO short-circuit (both sides are evaluated)

        int a = 5;   // Binary: 101
        int b = 3;   // Binary: 011

        int bitwiseResult = a | b;

        //   101
        // | 011
        // -----
        //   111 -> 7

        System.out.println("Bitwise OR (|): " + bitwiseResult);

        // -----------------------------------------
        // 2️⃣ LOGICAL OR (||)
        // -----------------------------------------
        // • Works ONLY on booleans
        // • Uses short-circuit
        // • If left side is true, right side is NOT evaluated

        int x = 10;
        int y = 0;

        // Logical OR example
        if (x > 5 || y > 1) {
            System.out.println("Logical OR: at least one condition is true");
        }

        // -----------------------------------------
        // 3️⃣ SHORT-CIRCUIT DEMONSTRATION
        // -----------------------------------------

        int i = 5;

        // Logical OR (||) -> SAFE
        // Left side is true, so right side is skipped
        if (i == 5 || (10 / 0) > 1) {
            System.out.println("Logical OR skipped the risky expression");
        }

        // Bitwise OR (|) -> DANGEROUS here
        // Both sides are evaluated -> division by zero
        // Uncomment to see Runtime Exception
        /*
        if (i == 5 | (10 / 0) > 1) {
            System.out.println("This will crash");
        }
        */

        // -----------------------------------------
        // INTERVIEW SUMMARY (IMPORTANT)
        // -----------------------------------------
        // |  -> bit-level OR, no short-circuit
        // || -> logical OR, short-circuit
    }   
}
