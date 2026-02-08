
public class eleven {
    public static void main(String[] args) {
        // =========================================
        // CONVERT BINARY NUMBER TO DECIMAL
        // =========================================

        String binary = "1101";  // binary input
        int decimal = 0;
        int power = 0;           // represents 2^power

        // Logic:
        // Start from RIGHTMOST bit
        // Multiply bit with 2^position
        // Add to decimal result

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0'; // convert char '0'/'1' to int
            decimal += bit * Math.pow(2, power);
            power++;
        }

        System.out.println("Binary : " + binary);
        System.out.println("Decimal: " + decimal);

        // =========================================
        // DRY RUN (binary = 1101)
        // =========================================
        // Right to left:
        // 1 × 2^0 = 1
        // 0 × 2^1 = 0
        // 1 × 2^2 = 4
        // 1 × 2^3 = 8
        // Total = 13
    }    
}
