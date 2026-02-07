import java.math.BigDecimal;

public class seventeen {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("10.123456789123456789123456789");
        BigDecimal num2 = new BigDecimal("90.987654321987654321987654321");

        BigDecimal sum = num1.add(num2);

        System.out.println(sum);
    }
}
