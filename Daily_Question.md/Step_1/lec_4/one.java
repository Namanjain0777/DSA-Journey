public class one {
    public static void main(String[] args) {
        int n = 11;
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        System.out.println(isPrime ? "Yes it is Prime" : "Not a Prime");
    }
}