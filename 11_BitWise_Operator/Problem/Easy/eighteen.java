public class eighteen {
    public static void main(String[] args) {
        int num = 6;

        int pos = 0;
        int temp = num;

        while (temp > 1) {
            temp = temp >> 1;  // shift right
            pos++;
        }

        System.out.println("MSB position: " + pos);
        System.out.println("MSB value: " + (1 << pos));
    }
}
