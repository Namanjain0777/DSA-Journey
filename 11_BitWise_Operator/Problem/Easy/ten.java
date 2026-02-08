
public class ten {
    public static void main(String[] args) {
         // =========================================
        // CONVERT DECIMAL NUMBER TO BINARY
        // =========================================

        int decimal = 13;

        // We will build binary in reverse order
        String binary = "";

        // Logic:
        // Repeatedly divide number by 2
        // Store remainder (0 or 1)
        // Reverse at the end

        int temp = decimal;

        while (temp > 0) {
            int remainder = temp % 2;   // get last bit
            binary = remainder + binary; // prepend bit
            temp = temp / 2;            // reduce number
        }

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary : " + binary);

        // =========================================
        // STEP-BY-STEP DRY RUN (decimal = 13)
        // =========================================
        // 13 % 2 = 1 → binary = "1"
        // 6  % 2 = 0 → binary = "01"
        // 3  % 2 = 1 → binary = "101"
        // 1  % 2 = 1 → binary = "1101"
        // 0 → stop
    }    
}
