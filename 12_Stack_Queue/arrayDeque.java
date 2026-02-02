import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(10);
        ad.addLast(20);
        ad.addFirst(30);
        ad.addLast(40);
        System.out.println(ad);
    }
}
