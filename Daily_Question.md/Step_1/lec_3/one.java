import java.util.HashSet;

public class one {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        System.out.println("Array contents: ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.err.println("In List: ");
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
