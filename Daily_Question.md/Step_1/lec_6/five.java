import java.util.HashSet;

public class five {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };  // Example array

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.println("Have Duplicate");
                return;
            }
            seen.add(num);
        }

        System.out.println("No Duplicate found");
    }
}