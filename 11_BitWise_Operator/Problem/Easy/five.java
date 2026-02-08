
public class five {
    public static void main(String[] args) {
        // =========================================
        // BITWISE AND (&) vs LOGICAL AND (&&)
        // =========================================

        // -----------------------------------------
        // 1️⃣ BITWISE AND (&)
        // -----------------------------------------
        // • Works on BITS (0s and 1s)
        // • Can also work on booleans
        // • NO short-circuit (both sides are evaluated)

        int a = 5;   // Binary: 101
        int b = 3;   // Binary: 011

        int bitwiseResult = a & b;

        //   101
        // & 011
        // -----
        //   001 -> 1

        System.out.println("Bitwise AND (&): " + bitwiseResult);

        // -----------------------------------------
        // 2️⃣ LOGICAL AND (&&)
        // -----------------------------------------
        // • Works ONLY on booleans
        // • Uses short-circuit
        // • If left side is false, right side is NOT evaluated

        int x = 10;
        int y = 0;

        // Logical AND example
        if (x > 5 && y > 1) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("Logical AND: condition failed");
        }

        // -----------------------------------------
        // 3️⃣ SHORT-CIRCUIT DEMONSTRATION
        // -----------------------------------------

        int i = 0;

        // Logical AND (&&) -> SAFE
        // Right side is skipped because left side is false
        if (i != 0 && (10 / i) > 1) {
            System.out.println("This will not run");
        }

        // Bitwise AND (&) -> DANGEROUS here
        // Both sides are evaluated -> division by zero
        // Uncomment to see Runtime Exception
        /*
        if (i != 0 & (10 / i) > 1) {
            System.out.println("This will crash");
        }
        */

        // -----------------------------------------
        // INTERVIEW SUMMARY (IMPORTANT)
        // -----------------------------------------
        // &  -> bit-level operation, no short-circuit
        // && -> logical operation, short-circuit
    }    
}
