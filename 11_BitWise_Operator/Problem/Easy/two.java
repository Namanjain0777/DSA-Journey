public class two {
    public static void main(String[] args) {

        // ===============================
        // BITWISE OR (|) OPERATOR
        // ===============================

        // OR Truth Table:
        // 0 | 0 = 0
        // 0 | 1 = 1
        // 1 | 0 = 1
        // 1 | 1 = 1
        //
        // Rule:
        // Result bit is 1 if AT LEAST ONE bit is 1

        int a = 5;   // Binary: 101
        int b = 3;   // Binary: 011

        int result = a | b;

        // Bit-by-bit operation:
        //   101
        // | 011
        // -----
        //   111  -> 7

        System.out.println("a | b = " + result); // Output: 7

        // ===============================
        // TIP 1: Set (TURN ON) a specific bit
        // ===============================

        int n = 4;     // Binary: 100
        int k = 1;     // Turn ON bit at position 1

        // (1 << k) creates a mask
        // OR with mask sets that bit to 1
        int turnedOn = n | (1 << k);

        // 100
        // |010
        // ----
        // 110 -> 6

        System.out.println("After turning ON bit " + k + ": " + turnedOn);

        // ===============================
        // TIP 2: Combine flags / permissions
        // ===============================

        int READ  = 1; // 001
        int WRITE = 2; // 010
        int EXEC  = 4; // 100

        // Combine permissions using OR
        int permission = READ | WRITE;

        // permission = 001 | 010 = 011

        System.out.println("Permission value: " + permission);

        // ===============================
        // TIP 3: Check if any bit is set
        // ===============================

        int x = 0;
        int y = 5;

        // If result is not 0, at least one bit is set
        if ((x | y) != 0) {
            System.out.println("At least one number has a set bit");
        }

        // ===============================
        // IMPORTANT INTERVIEW TIP
        // ===============================
        // Bitwise OR (|) works on bits
        // Logical OR (||) works on booleans
        //
        // |  -> no short-circuit
        // || -> short-circuit
    }
}
