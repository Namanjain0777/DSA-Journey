import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class five {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        System.out.println("Using = " + (a==b));
        System.out.println("Using .equals " + (a.equals(b)));
        System.out.println("Using Arrays.equals " + (Arrays.equals(a, b)));

        // Using Collections
        int[] c = {1,2,3};
        int[] d = {1,2,3};

        List<Integer> la = Arrays.stream(c).boxed().collect(Collectors.toList());
        List<Integer> lb = Arrays.stream(d).boxed().collect(Collectors.toList());
        System.out.println(la.equals(lb)); // true

    }
}
