import java.math.BigInteger;

public class sixteen {
    public static void main(String[] args) {

        BigInteger num1 = new BigInteger("59526518941518416515320");
        BigInteger num2 = new BigInteger("168416518941189136168151354");

        BigInteger product = num1.multiply(num2);

        System.out.println("Product: " + product);
    }
}
