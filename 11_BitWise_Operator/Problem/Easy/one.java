public class one {
    public static void main(String[] args) {

        // ===============================
        // BITWISE AND (&) OPERATOR
        // ===============================

        // AND Truth Table:
        // 0 & 0 = 0
        // 0 & 1 = 0
        // 1 & 0 = 0
        // 1 & 1 = 1
        //
        // Rule:
        // Result bit is 1 ONLY if both bits are 1

        int a = 5;   // Binary: 101
        int b = 3;   // Binary: 011

        int result = a & b;

        // Bit-by-bit operation:
        //   101
        // & 011
        // -----
        //   001  -> 1

        System.out.println("a & b = " + result); // Output: 1

        // ===============================
        // TIP 1: Check EVEN or ODD
        // ===============================

        int num = 10;

        // Last bit of even number is always 0
        // Last bit of odd number is always 1
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // ===============================
        // TIP 2: Check if a specific bit is SET
        // ===============================

        // Set bit = force ON a bit
        // A mask is a number used to target specific bit positions.
        int n = 8;      // Binary: 1000
        int k = 3;      // Check 3rd bit (0-based index)

        // (1 << k) creates a mask
        // 1 << 3 = 1000
        if ((n & (1 << k)) != 0) {
            System.out.println("Bit " + k + " is SET");
        } else {
            System.out.println("Bit " + k + " is NOT SET");
        }

        // ===============================
        // TIP 3: Turn OFF a specific bit
        // ===============================

        int x = 7;      // Binary: 111
        int bit = 1;    // Turn off bit 1

        // ~(1 << bit) creates mask with 0 at position 'bit'
        // x & mask turns that bit OFF
        int turnedOff = x & ~(1 << bit);

        // 111
        // &101
        // ----
        // 101 -> 5

        System.out.println("After turning off bit " + bit + ": " + turnedOff);

        // ===============================
        // IMPORTANT INTERVIEW TIP
        // ===============================
        // Bitwise AND (&) works on BITS
        // Logical AND (&&) works on BOOLEANS
        //
        // &  -> no short-circuit
        // && -> short-circuit
    }
}
