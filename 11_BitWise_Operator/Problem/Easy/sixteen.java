
public class sixteen {
    public static void main(String[] args) {
        int num = -15;
        // Right shift by 31 to extract sign bit
        int sign = num >> 31;
        // sign == 0  → positive or zero
        // sign == -1 → negative
        if (sign == 0) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }    
}
